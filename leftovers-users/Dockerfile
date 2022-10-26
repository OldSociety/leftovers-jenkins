# Pull base image.
FROM openjdk:17-jdk-slim-buster

COPY ./target/leftovers-users-0.1.0-SNAPSHOT.jar leftovers-users.jar

CMD ["java", "-jar", "leftovers-users.jar"]
EXPOSE 8082