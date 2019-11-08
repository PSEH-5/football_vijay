FROM openjdk:8-jdk-alpine
ADD target/football-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","app.jar"]
