FROM openjdk:14-alpine
COPY build/libs/microapplication-*-all.jar microapplication.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "microapplication.jar"]