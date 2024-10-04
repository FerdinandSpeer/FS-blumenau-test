FROM --platform=linux/amd64 openjdk:21
EXPOSE 8080
COPY backend/target/app.jar BasicApp.jar
ENTRYPOINT ["java", "-jar", "BasicApp.jar"]

