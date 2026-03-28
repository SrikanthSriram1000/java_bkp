FROM tomcat:latest
EXPOSE 8080
COPY target/docker-proj-0.0.1-SNAPSHOT.jar /usr/local/tomcat/webapps/
CMD ["java", "-jar", "docker-proj-0.0.1-SNAPSHOT.jar"]