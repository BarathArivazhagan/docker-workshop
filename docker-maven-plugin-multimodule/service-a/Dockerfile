FROM openjdk:8-jdk-alpine
ADD target/service-a-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]