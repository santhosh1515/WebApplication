FROM eclipse-temurin:17
COPY target/WebApplication.jar WebApplication.jar
CMD [ "java","-jar","WebApplication.jar" ]