FROM openjdk:17

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} Course-Management-System.jar

ENTRYPOINT ["java", "-jar", "Course-Management-System.jar"]

EXPOSE 8080