FROM openjdk:8-jre-alpine
WORKDIR /app
COPY ./target/monitoringapp-1.0-SNAPSHOT.jar ./monitoringapp-1.0-SNAPSHOT.jar
COPY ./target/jmx_prometheus_javaagent-0.17.0.jar ./jmx_prometheus_javaagent-0.17.0.jar
COPY ./jmxexportconfig.yml ./jmxexportconfig.yml
EXPOSE 12345
CMD [ "java", "-javaagent:./jmx_prometheus_javaagent-0.17.0.jar=12345:./jmxexportconfig.yml", "-jar", "monitoringapp-1.0-SNAPSHOT.jar" ]
