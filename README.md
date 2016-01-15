# Spring Boot JumpStart

Enterprise data services are currently hosted in ServiceMix environment. 
Evolving stakeholder requirements,including Predix 2.0, are driving the need
to explore alternative service hosting platforms. Springboot, which enables 
the Spring Framework a viable candidate for this need is a tool that offers 
a new paradigm for developing Spring applications with minimal friction. 
The goal of this repository is to provide the context to familiarize yourself
with the tool, and some best practices for common use cases.

## Core Concepts

### Automatic Configuration
Automatic Configuration means the developer no longer has to write explicity
configuration for common configuration scenarios. For example, needing to 
instantiate a JbdcTemplate as a bean in the Spring application context when 
accessing a relational database. That's boilerplate you code you need to write
every time, and Spring applications are notorious for large amounts of configuration.
Spring Boot detects libraries in your class path and instantiates and configures them
automatically, so the developer can forget about it.

### Starter Dependencies
Spring Boot provides project dependency management through starter dependencies,
and enables you to define your project by features, rather than tinker with dependencies
and versions manually. Starter Dependencies take advantage of transitive dependency
resolution in Maven or Gradle dependcies and provides an opinionted stack of dependencies 
when resolved.  For example, including the `spring-web ` starter-dependency will add
`spring-aop`, `spring-beans`, among other packages automatically.

### Command Line Tool
The Command Line Tool is a way to write complete applications without a traditional 
project build.  The CLI detects types used in the program, and it knows what
dependencies to then include in the ClassPath. Auto-configuration then kicks in and
ensures a Dispatcher Servlet is running and Spring MVC is enabled.

### Actuator
The Actuator allows the developer to insepct your application internals at runtime.
For example, the developer can see what beans are configured, what decisions were
made by auto-configure, environment variables, the state of threads, etc. The Actuator
exposees data via API endpoints and a shell interface.

## Up and Running

- Ensure you have Java, Maven or Gradle, and Spring intalled and configured.
- Use the [Spring Initializer]: <https://start.spring.io> to bootstrap your
project or use the the command line too `spring init`
- Once your project is built and opened in your favorite IDE, you can run your
spring boot application with `gradle bootRun` or 'mvn:spring-boot:run`

## Resources
[Spring Boot Documentation]: <http://spring.io/docs>
