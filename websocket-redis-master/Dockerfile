FROM openjdk:19
VOLUME /tmp
ARG JAR_FILE=target/websocketredis.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]