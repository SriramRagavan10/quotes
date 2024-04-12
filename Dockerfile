FROM eclipse-temurin:17
COPY target/lyrics.jar lyrics.jar
CMD [ "java","-jar","lyrics.jar" ]