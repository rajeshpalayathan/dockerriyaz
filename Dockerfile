FROM eclipse-temurin:17
COPY target/riyaz.jar riyaz.jar
CMD ["java","-jar","riyaz.jar"]