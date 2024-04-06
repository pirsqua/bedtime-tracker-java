# Use the official Maven image with Java 17 and slim distro for the build stage
FROM maven:3.9.6-amazoncorretto-21 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml file to download dependencies
COPY pom.xml .

# Download the project dependencies
RUN mvn dependency:go-offline

# Copy the source code to the container
COPY src ./src

# Build a release artifact
RUN mvn clean package

# Use OpenJDK JDK 17 slim for the runtime stage of the Docker build
FROM amazoncorretto:21

# Set the working directory in the container
WORKDIR /app

# Copy the jar file built in the first stage
COPY --from=build /app/target/*.jar app.jar

# Set the startup command to run the binary
CMD ["java", "-jar", "app.jar"]
