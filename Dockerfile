FROM amazoncorretto:17.0.10-alpine
# Work directory for application

WORKDIR /app

# Copy project files
COPY . .

#RUN gradle package
# Copy the JAR to the final location
COPY target/TWF-0.0.3-SNAPSHOT.jar /app/app.jar

# Expose port (optional)
EXPOSE 8080
# Set the main class (replace with your actual class name)
ENTRYPOINT ["java", "-jar", "app.jar"]



