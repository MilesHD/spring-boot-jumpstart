# Spring Boot JumpStart

Evolving stakeholder requirements,including Predix 2.0, are driving the need to explore alternative service hosting platforms to ServiceMX environments. We need a tried a tested enterprise framework and a way to rapidly develop, deploy, and maintain applications in this new environment. Spring Boot is a tool that offers a simple paradigm for developing Spring applications with minimal friction. The goal of this repository is to provide you context to familiarize yourself with the tool, and some best practices for common use cases.

## Core Concepts

Spring Boot is a tool that leverages existing Java and Spring ecosystem technologies to provide a streamlined developer experience. Spring Boot has four main offerings: automatic configuration, starter dependencies, a command line tool, and the actuator. 

### Automatic Configuration

Automatic Configuration means the developer no longer has to write explicit configuration for common configuration scenarios. For example, when you need to instantiate a JbdcTemplate as a bean in the Spring application context for 
accessing a relational database. That's boilerplate you code you need to write every time, and Spring applications are notorious for large amounts of configuration. Spring Boot detects libraries in your class path and instantiates and configures them automatically, relieving the developer the responsibilty of doing so.

### Starter Dependencies

Spring Boot provides project dependency management through starter dependencies. Starter dependencies are essentially groups of opinioned and maintained maven or gradle dependencies, coupled to provide a distinct set of functionality.
This enables you to define your project by features, rather than tinker with dependencies and versions manually. For example, including the `spring-web ` starter-dependency will add `spring-aop`, `spring-beans`, among other packages automatically.

### Command Line Tool

The Command Line Tool provides a way to write complete applications without a traditional project build.  The CLI detects types used in the program and thereby knows what dependencies to include in the ClassPath. Auto-configuration then kicks in and ensures a Dispatcher Servlet is running and Spring MVC is enabled.

### Actuator

The Actuator allows the developer to insepct your application internals at runtime. For example, the developer can see what beans are configured, what decisions were made by auto-configure, environment variables, the state of threads, etc. The Actuator exposees data via API endpoints and a shell interface.

## Up and Running

Assuming you are familiar with the basics of Java Development:
- Ensure you have Java, Maven or Gradle, and Spring intalled and configured.
- Use the [Spring Initializer](<https://start.spring.io>) or the the command line tool `spring init` to generate your project.
- Once your project files exist, you can run your spring boot application with `gradle bootRun` or `mvn:spring-boot:run` commands.

## Resources
- [Spring Boot Documentation](<http://spring.io/docs>)
- [Spring Boot in Action](<https://www.manning.com/books/spring-boot-in-action>)
