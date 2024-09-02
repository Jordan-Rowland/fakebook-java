FROM maven:latest AS builder

WORKDIR /usr/src/fakebook
COPY pom.xml .
RUN mvn -B dependency:go-offline

COPY . .
RUN mvn package

FROM alpine/java:22-jdk

WORKDIR /app
COPY --from=builder /usr/src/fakebook/*.jar .
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

COPY ./entrypoint.sh .
RUN chmod +x ./entrypoint.sh

ENTRYPOINT ["./entrypoint.sh", "java","-jar","/app/app.jar"]
