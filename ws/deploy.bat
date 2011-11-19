set TOMCAT_HOME=G:\Program Files\Active Endpoints\ActiveBPEL Designer\Server\ActiveBPEL_Tomcat
set LIBS=%TOMCAT_HOME%\shared\lib
set SERVLET_URL=http://localhost:8080/shipment/services/AdminService
java -cp "%LIBS%\axis.jar";"%LIBS%\commons-discovery.jar";"%LIBS%\commons-logging.jar";"%LIBS%\jaxrpc.jar";"%LIBS%\saaj.jar";"%LIBS%\wsdl4j.jar" org.apache.axis.client.AdminClient -l%SERVLET_URL% deploy.wsdd
