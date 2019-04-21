package com.devsubho.rest.webservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	// GET
	// URI: /hello-world
	// Method: helloWWorld
	@GetMapping("/hello-world")
	public String helloWorld(){
		return "Hello World!!";
	}
	
	// URI: /hello-world
	// Method: helloWWorld
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean(){
		return new HelloWorldBean("This is Hello World Bean");
	}
	
	// GET
	// URI: /hello-world/{name}
	// Method: helloWWorld
	@GetMapping("/hello-world/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
		return new HelloWorldBean(String.format("Hello, %s", name));
	}
}
