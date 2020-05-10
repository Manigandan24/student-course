FROM openjdk:8-jdk-alpine
ARG JAR_FILE=student-course-details/target/*.jar
#Copy jar into image
COPY ${JAR_FILE} /student-course-details-1.0.0-RELSEASE.jar
#run app with below cmd line
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=Default", "/student-course-details-1.0.0-RELSEASE.jar"]