# Pull base image.
FROM openjdk:17-jdk-slim-buster

COPY ./target/fooddelivery-0.0.1-SNAPSHOT.jar leftovers-orders.jar

CMD ["java", "-jar", "leftovers-orders.jar"]
EXPOSE 8082