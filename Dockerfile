FROM amazoncorretto:17.0.10-alpine
# Work directory for application

WORKDIR /app

# Copy project files
COPY . .

# Create the directory for the manifest file
RUN mkdir -p META-INF

# Copy the manifest file (optional)
COPY src/main/resources/META-INF/MANIFEST.MF META-INF/MANIFEST.MF


#RUN gradle package
# Copy the JAR to the final location
COPY target/artifacts/TWF_jar/TWF.jar /app/app.jar

# Expose port (optional)
EXPOSE 8080
# Set the main class (replace with your actual class name)
ENTRYPOINT ["java", "-cp", "app.jar", "com.example.TWF.TwfApplication"]



