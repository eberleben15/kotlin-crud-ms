# Use a Java 17 base image
FROM eclipse-temurin:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the build context
COPY build/libs/kotlin-crud-ms-0.0.1-SNAPSHOT.jar app.jar

# Expose the application's port
EXPOSE 8080

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "app.jar"]