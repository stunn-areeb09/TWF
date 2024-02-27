# Use a Gradle image with JDK 17
FROM gradle:8.5-jdk17-alpine AS build
# Expose the port your application listens on (optional)
EXPOSE 8080
ADD out/artifacts/TWF_jar/TWF.jar TWF.jar
# Set the main class (replace with your actual class name)
ENTRYPOINT ["java", "-jar", "TWF.jar"]

