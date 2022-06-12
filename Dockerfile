FROM openjdk:11
EXPOSE 9001
ADD target/product-microservice.jar product-microservice.jar
ENTRYPOINT ["java", "-jar", "/product-microservice.jar"]