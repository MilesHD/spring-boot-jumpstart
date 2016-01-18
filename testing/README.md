# Testing

Tests must ensure the code is accurate and does everything that is expected of it. Without a good test suite, you'll never know for sure if your application is doing what it's expected to.

## Integration Testing

Integration tests require an application context from Spring in order to start up the application and
run the test. This is accomplished through Spring's `SpringJUnit4ClassRunner`, which loads 
a Spring Application context and then Spring Boot enables auto-configuration and spins up web server
for running the integration test. It's important to let Spring wire up the beans that are the target
of the test the same way it wires up those beans when the application is running in production.

In our example file, `integration_test.java`, our test class is annotated with bot `@RunWith` and
`@ContextConfiguration` classes. `@RunWith` enables Spring integration testing and `@ContextConfiguration`
specifies which application context to load. Once our application context is loaded, we can inject
beans from that context using autowiring. Once we have the service we are testing we can assert the
system's proper functionality.

## Testing Apps in a Server

Propertly testing a Web application is more than unit functions verifying business functionality, you need to
HTTP requests at it and assert it handles those requests correctly. There are two options to test these
scenarios in Spring Boot: Spring Mock MVC, and Web Integration Tests. 

### Spring Mock MVC

Spring Mock MVC enables controllers to be tested in a mocked approximation of a servlet container without actually
starting an application server. To set up a Mock MVC in your test, you use MockMvcBuilders class, which offers two static
methods: `standaloneSetup()` and `webAppContextSetup()`. `standaloneSetup` expects you to manually instantiate and
inject the controllers you want to test, whereas `webAppContextSetup` works from an instance of `WebApplicationContext`,
which lets you load controllers as well as their dependencies for a full-blown integration test.

In our example file, `mock-mvc-test.java`, we create a MockMvcBuilders object from our WebApplicationContext
and can now test any controller in our application. The MockMvcBuilder object will handle all requests,
allowing you to focus on your system under test.


### Web Integration Tests

Web Integration Tests involve actually starting the application in an embedded servelet container (such as Tomcat
or Jetty), enabling tests that exercise ethe application in a real application server. Spring Boot's
`@WebIntegrationTest` annotation declares that you want Spring Boot to not only create an application context for your
test, but also start an embedded servlet container. Once the application is running along with the embedded container,
you can issue real HTTP requests against it and make assertions against the results. We show a simple example of this 
technique in our example file.


The main difference between the methods is that a server will result in a slower test than mocking a servlet container,
but server-based tests are closer to the real-world environment that they'll be running in when deployed to production.
In short, if speed is a bigger consideration, use Spring Mock MVC, otherwise, Web Integration are the most accurate
means of teseting if you're app works in production.
 

## Spring Boot's Test Utilities
