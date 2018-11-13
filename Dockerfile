FROM java:8

COPY target/*.jar /opt/customer-svc.jar

EXPOSE 9093

ENTRYPOINT java -jar /opt/customer-svc.jar