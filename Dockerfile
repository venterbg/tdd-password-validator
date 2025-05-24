# Use a slim JRE base image
FROM eclipse-temurin:17-jre-alpine

# Set a working directory
WORKDIR /app

# Copy the fat JAR from the build output to the container
# The JAR name should match what shadowJar produces (e.g., password-validator-service-1.0.0.jar)
COPY build/libs/password-validator-service-1.0.0.jar app.jar

# Expose the port the application runs on
EXPOSE 7070

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
