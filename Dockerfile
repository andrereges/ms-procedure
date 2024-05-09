FROM amazoncorretto:17-alpine-jdk

MAINTAINER Andrê Reges <andreriggs90@gmail.com>

WORKDIR /app

COPY target/*.jar app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app/app.jar"]