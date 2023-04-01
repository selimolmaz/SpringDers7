package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestComponent {
	public RequestComponent() {
		System.out.println("Request componenet created!");
	}
	
	public String getName() {
		return "My request component";
	}
}
