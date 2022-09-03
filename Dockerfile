FROM openjdk:11
EXPOSE 5000
ADD build/libs/docker-test.jar docker-test.jar
ENTRYPOINT ["java" , "-jar" ,"/docker-test.jar"]