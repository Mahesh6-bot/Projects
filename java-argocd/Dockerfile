FROM openjdk:17-jdk-slim

ARG artifact=target/demo-1.0-SNAPSHOT.jar app.jar

WORKDIR /opt/app

COPY ${artifact} app.jar

ENTRYPOINT ["java","-jar","app.jar"]
