FROM eclipse-temurin:17
COPY traget/quotes.jar quotes.jar
CMD [ "java","-jar","quotes.jar" ]