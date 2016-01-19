# Apache Camel Spring Boot Example

Apache Camel is an open source Java framework that focuses on making integration easier and more accessible to developers.
It does this by providing:
 - concrete implementations of all the widely used Enterprise Integration Patterns (EIP)
 - connectivity to a great variety of transports and APIs
 - easy to use Domain Specific Languages (DSLs) to wire EIPs and transports together 

This example shows how to work with the simple Camel application based on the Spring Boot.

The example generates messages using timer trigger, writes them to the standard output and the mock
endpoint (for testing purposes).

This example exposes Jolokia API and Spring Boot actuators endpoints (like metrics) via the webmvc endpoint. We consider
this as the best practice - Spring Boot applications with these API exposed can be easily monitored and managed by the
3rd parties tools.

We recommend to package your application as a fat WAR. Fat WARs can be executed just as regular fat jars, but you can also
deploy them to the servlet containers like Tomcat. Fat WAR approach gives you the deployment flexibility, so we highly
recommend it.

## Build
You will need to compile this example first:
	
	mvn install

## Run
To run the example type
	
	mvn spring-boot:run

You can also execute the fat WAR directly:

	java -jar target/camel-example-spring-boot.war

You will see the message printed to the console every second.

To stop the example hit `ctrl + c`
