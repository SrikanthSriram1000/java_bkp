FROM tomcat:latest
WORKDIR /app
COPY target/docker-proj-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]