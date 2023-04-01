package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class FirstController {
	@Autowired
	private MyComponent myComponent;
	
	@Autowired
	private RequestComponent requestComponent;
	
	@Autowired
	private SessionCompponent sessionCompponent;
	
	@GetMapping(path = "/names")
	public String getNameOfComponent() {
		return this.requestComponent.getName();
	}
	@GetMapping(path = "/session")
	public String getNameOfComponent1() {
		return this.sessionCompponent.getName();
	}
}
