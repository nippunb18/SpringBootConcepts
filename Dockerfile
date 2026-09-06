FROM eclipse-temurin:17-jre-alpine

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the built JAR file into the container
# For Maven: target/*.jar | For Gradle: build/libs/*.jar
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Step 4: Expose the port the Spring Boot app runs on (Default: 8080)
EXPOSE 8080

# Step 5: Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]