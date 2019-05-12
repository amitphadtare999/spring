package com.amitinfotech.java.restfulwebservices.helloworld;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	
	@GetMapping(path="hello/name/{name}")
	public HelloWorldBean HelloWorld(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("Hello %s", name));
	}
	
	@GetMapping(path="/")
	public WelcomeBean welcome()
	{
		return new WelcomeBean(1, "Welcome to restful api", new ArrayList<>());
	}

}
