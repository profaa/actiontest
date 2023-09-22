FROM openjdk:17-jdk
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} profsa/action.jar
ENTRYPOINT ["java","-jar","/profsa/action.jar"]