FROM eclipse-temurin:17
COPY target/quotes.jar quotes.jar
CMD [ "java","-jar","quotes.jar" ]