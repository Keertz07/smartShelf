FROM openjdk:17

COPY target/libraryManagement.war /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "libraryManagement.war"]
