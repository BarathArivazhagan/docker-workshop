FROM openjdk:8-jdk-alpine
MAINTAINER BARATH
EXPOSE 8080
ADD target/spring-rdbms-demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]