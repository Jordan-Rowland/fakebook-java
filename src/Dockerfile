#FROM openjdk:22-jdk-alpine

FROM alpine/java:22-jdk
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

# add entrypoint.sh
COPY ./entrypoint.sh .
RUN chmod +x ./entrypoint.sh

# run entrypoint.sh
ENTRYPOINT ["./entrypoint.sh", "java","-jar","/app.jar"]
