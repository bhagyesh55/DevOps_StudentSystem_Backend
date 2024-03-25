FROM openjdk:17

ADD /target/studentSystem-0.1.jar student_system_backend.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "student_system_backend.jar"]