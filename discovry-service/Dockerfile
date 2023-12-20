FROM openjdk:17-oracle
VOLUME /tmp
COPY target/*.jar ap.jar
ENTRYPOINT ["java","-jar","/ap.jar"]