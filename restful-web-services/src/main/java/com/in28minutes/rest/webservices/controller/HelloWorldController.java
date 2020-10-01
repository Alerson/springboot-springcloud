package com.in28minutes.rest.webservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.bean.HelloWordBean;

@RestController
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping("/hello-world-bean")
	public HelloWordBean helloWorldBean() {
		return new HelloWordBean("Hello World");
	}

	@GetMapping("hello-world/path-variable/{name}")
	public HelloWordBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWordBean(String.format("Hello World, %s", name));
	}

}
