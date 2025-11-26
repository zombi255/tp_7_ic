# Step 1: Build the app using Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY demo/pom.xml ./          # نسخ pom.xml من مجلد demo
COPY demo/src ./src           # نسخ مجلد src من demo
RUN mvn clean package -DskipTests

# Step 2: Runtime image
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
