package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//burada oluşturulan bir obje inject edildi ve isteyen herkese aynı yer işaret edildi
//@Scope("singleton")
//burada ise istek sayısı kadar obje üretilir!
@Scope("prototype")
public class MyComponent {
	public MyComponent() {
		System.out.println("My Componenet created at " + LocalDateTime.now());
	}
}
