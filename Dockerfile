
FROM gradle:8.5-jdk17-alpine AS build
# Work directory for application

WORKDIR /app

# Copy project files
COPY . .

# Create the directory for the manifest file
RUN mkdir -p META-INF

# Copy the manifest file (optional)
COPY src/main/resources/META-INF/MANIFEST.MF META-INF/MANIFEST.MF

# Copy the JAR to the final location
COPY target/artifacts/TWF_jar/TWF.jar /app/app.jar

# Set the main class (replace with your actual class name)
ENTRYPOINT ["java", "-cp", "app.jar", "com.example.TWF.TwfApplication"]

# Expose port (optional)
EXPOSE 8080
