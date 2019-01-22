FROM tomcat

RUN apt-get update && apt-get -y upgrade

WORKDIR /usr/local/tomcat

# Copy to images tomcat path
ADD target/form-1-SNAPSHOT-1.0.0.war /usr/local/tomcat/webapps/

#COPY tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
#COPY context.xml /usr/local/tomcat/webapps/manager/META-INF/context.xml

EXPOSE 080
