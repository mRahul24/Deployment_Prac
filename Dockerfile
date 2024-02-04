FROM openjdk:17

ADD target/Docker_Test.jar Docker_Test.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","Docker_Test.jar"]
