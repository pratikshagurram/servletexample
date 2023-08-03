FROM tomcat:9.0
COPY target/MavenProject.war /usr/local/tomcat/webapps/MavenProject.war
