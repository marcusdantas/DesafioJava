FROM openjdk:8-jdk-alpine
LABEL maintainer="marcusegdantas@gmail.com"
VOLUME /tmp
ARG JAR_FILE=target/DesafioJava-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} desafiojava.jar
ENTRYPOINT ["java","-D java.security.egd=file:/dev/./urandom","-jar","/desafiojava.jar"]