# FROM openjdk:8-jre-alpine
FROM openjdk:11
WORKDIR /app
COPY ./target/monitoringapp-1.0-SNAPSHOT.jar ./monitoringapp-1.0-SNAPSHOT.jar
COPY ./target/jmx_prometheus_javaagent-0.17.0.jar ./jmx_prometheus_javaagent-0.17.0.jar
COPY ./jmxexportconfig.yml ./jmxexportconfig.yml
EXPOSE 12345 8888
CMD [ "java", "-javaagent:./jmx_prometheus_javaagent-0.17.0.jar=12345:./jmxexportconfig.yml", "-Dcom.sun.management.jmxremote", "-Dcom.sun.management.jmxremote.local.only=false", "-Dcom.sun.management.jmxremote.port=8888", "-Dcom.sun.management.jmxremote.rmi.port=8888", "-Dcom.sun.management.jmxremote.host=0.0.0.0",  "-Djava.rmi.server.hostname=0.0.0.0", "-Dcom.sun.management.jmxremote.authenticate=false", "-Dcom.sun.management.jmxremote.ssl=false", "-jar", "monitoringapp-1.0-SNAPSHOT.jar" ]
