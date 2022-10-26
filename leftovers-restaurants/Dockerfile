# Pull base image.
FROM openjdk:17-jdk-slim-buster

COPY ./target/leftovers-restaurants-0.0.1-SNAPSHOT.jar leftovers-restaurants.jar

CMD ["java", "-jar", "leftovers-restaurants.jar"]
EXPOSE 8081