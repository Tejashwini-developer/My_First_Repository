# Use a lightweight base image with Java 17 (match your project's version)
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the generated JAR file from the host's target folder to the container
# Replace 'demo-0.0.1-SNAPSHOT.jar' with your actual JAR filename
COPY target/practice-project-0.0.1-SNAPSHOT.jar app.jar

# Expose the default Spring Boot port
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
