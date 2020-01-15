package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/*
 * @RestController : This means that it is ready for use by spring mvc to handle web request.
 * It is a combination of @Controller and @ResponseBody, used to create Restful webservices. Spring RestController
 * takes care of mapping request data to the defined request handler method. Once the response body is generated from 
 * the handler method it converts it it JSON or XNL reponse.
 * 
 * @RequestMapping("Pass a  name like '/home'") : This annotation maps HTTP requests to handler methods of MVC and REST controllers.
 */
@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String sayHello() {
		return "HI to All";
	}
	//https://github.com/rsp777/springboot-examples
	@RequestMapping(value = "/hello/{message}", method = RequestMethod.GET)
	public String sayHello(@PathVariable("message")String message) {
		return "<h1>"+message+"</h1>";
	}
	
}
