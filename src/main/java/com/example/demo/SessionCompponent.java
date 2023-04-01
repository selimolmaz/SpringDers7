package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
@Component
@SessionScope
public class SessionCompponent {
	public SessionCompponent() {
		System.out.println("Session component created!");
	}
	
	public String getName() {
		return "My session component";
	}

	
}
