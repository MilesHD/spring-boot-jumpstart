# Explicit Configuration

One of the best things about Spring Boot is its automatic configuration.
If you've configured your application as a WAR, when jou run your application through 'mvn spring-boot:run
or 'gradle bootRun', Spring Boot handles spinning up a Tomcat Instance for you and bootstrapping your application as a servlet.
Spring Boot allows explicit configuration through:
 - Explicit configuration Overrides
 - Fine-Grained configuration with Properties

## Overriding Spring Boot Auto-Configuration
Most of the time, there is no need to override the auto-configured beans. In cases where you do need oo override
auto-configuration, simply write Spring configuration as if auto-configuration didn't exist.
It can be any form that Spring supports, including XML and Java. Spring Configuraiton is outside the scope of
this repository, but you can find a great tutorial for it [here](http://www.tutorialspoint.com/spring/spring_java_based_configuration.htm).

## Externalizing Coniguration with Properties
Spring has three primary methods of using properties to configure your app:

- Specify a property as a command-line parameter when you run the app
` java -jar <application>.jar --spring.main.show-banner=false `

- Create a file named `application.properties`
`spring.main.show-bannger=false'`

- Create a YAML file named `application.yml`
```
    spring:
        main:
            show-banner: false
```

There are over 300 properties you can set to adjust the beans of your Spring Boot application. We will review
a configurations for some of the most common.

### Configuring Tomcat Server
Often we have other applications running on port 8080, which is the port Spring Boot uses by default. To change this,
in your application.properties, write `server.port=8000`.

### Configuring Logging
We wish to set our root logging level to WARN, but log Spring Security logs at the DEBUG level. Additionally, we want
to write log entries to a file named "logs.log" at "/var/logs/". To do so we use the `logging.path` and `logging.file`
properties.

### Configuring a Data Source
We configure a MySQL data source by providing the database URL and credentials
