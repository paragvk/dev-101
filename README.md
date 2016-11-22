# DEV 101

# Prerequisites

1. Git
2. Eclipse
3. JDK 7+
4. Maven 3+
5. Tomcat 7+

Setup JDK and Maven in Eclipse. To download project - Fork dev-101 and git clone.

# Project 1

Simple project with log4j

# Project 2

Log4j using Maven

# Project 3

Simple Spring project (IOC)

# Project 4

Spring/Log4j with Maven

# Project 5

Simple Web app using Maven (JSP and Servlet)

To run in Eclipse, Run As > Run on Server > Tomcat

# Project 6

Simple Spring MVC (using JSP as template engine)

To run in Eclipse, Run As > Run on Server > Tomcat

Note: When running in Eclipse you may need to add the "Maven Dependency" in the Deployment Assembly (if you see ClassNotFound errors on startup)
* right click on your project and choose properties.
* click on Deployment Assembly.
* click add
* click on "Java Build Path Entries"
* select Maven Dependencies"
* click Finish.

Rebuild and deploy again

Test pages:
1. http://localhost:8080/SimpleSpringMVC/hello (returns back just a String as response body - No HTML)
2. http://localhost:8080/SimpleSpringMVC/mypage?name=prasad (if 'name' parameter not passed, name will default to 'World' as configured in Controller method)

# Project 7 

Modern Spring MVC application using [Spring Boot](http://projects.spring.io/spring-boot/) (using [Thymleaf](http://www.thymeleaf.org/) modern template engine for html)

To run in Eclipse run the main class `ModernWebappApplication.java` (thats it!)

Test page: http://localhost:8080/greeting?name=prasad

Goodies:
* No Tomcat installation needed, the application embeds Tomcat within it
* Access application without context root (notice we didnt have to use ugly path like localhost:8080/MyUglyContextRoot/hello)
* `mvn clean install` creates a self sufficient jar with everything bundled inside and ready to run anywhere where there is Java (To run on a server, upload the built jar to server and fire `java -jar SpringBootSpringMVC-x.x.x.jar`)
* Very small POM getting rid of necessity to maintain many dependencies and respective versions
* All customization is done in single file `application.properties`. See [Appendix](https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html) for further customization.
* Many more ..  

# Project 8

Struts2 Hello World

To run in Eclipse, Run As > Run on Server > Tomcat
This project also demostrates how a model can be injected in view using Action class.



