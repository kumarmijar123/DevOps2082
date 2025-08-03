FROM tomcat:9-jdk17

RUN rm -rf /usr/local/tomcat/webapps/*

COPY WebContent/ /usr/local/tomcat/webapps/ROOT/

COPY build/classes/ /usr/local/tomcat/webapps/ROOT/WEB-INF/classes/

COPY mysql-connector-j-8.4.0.jar /usr/local/tomcat/lib/

EXPOSE 8080
