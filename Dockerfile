FROM tomcat:9-jdk17

RUN rm -rf /usr/local/tomcat/webapps/*

COPY WebContent/ /usr/local/tomcat/webapps/ROOT/

COPY build/classes/ /usr/local/tomcat/webapps/ROOT/WEB-INF/classes/

EXPOSE 8080
