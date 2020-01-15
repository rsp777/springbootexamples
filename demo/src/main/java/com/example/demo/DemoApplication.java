package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * @SpringBootApplication : 	It adds the following annotations.	
 * 		@ComponentScan : Tells Spring to look for other components, configurations, and services in the com/example package, 
 * 		letting it find the controllers.
 * 		
 * 		@EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property
 *      settings. 
 * 		For example, if spring-webmvc is on the classpath, 
 * 		this annotation flags the application as a web application and activates key behaviors, such as setting up a DispatcherServlet.
 * 		@Configuration: Tags the class as a source of bean definitions for the application context.
 */		
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
