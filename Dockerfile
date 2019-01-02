FROM openjdk:8-alpine

COPY target/uberjar/hl-cup.jar /hl-cup/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/hl-cup/app.jar"]
