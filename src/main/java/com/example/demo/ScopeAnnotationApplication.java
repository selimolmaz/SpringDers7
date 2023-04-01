package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.components.MycomponentScope;

/*

@ComponentScan -> Belirtilen package (lar) altindaki component class 'larin taranarak tespit
edilme islemini yönetebilmemizi saglayan bir anotasyondur.

@Component
public class MyComponent{ }

basePackages -> Taranacak package 'lari String listesi olarak belirtiyoruz
ve bu package 'larin altindaki component class' lar taranarak
tespit ediliyor.

Not: Eger basePackages ile package listesi belirtilmezse
@ComponentScan anotasyonunun yazild1gl class' in package'1
basePackage olarak kabul edilir.

basePackageClasses -> Bu özellikle belirtilen class listesindeki class 'larin
package' Larz basePackages olarak kabul edilir.

*/

@SpringBootApplication
@ComponentScan(basePackages = "com.example.components")
public class ScopeAnnotationApplication {
	
	@Autowired
	private MycomponentScope mycomponentScope;

	public static void main(String[] args) {
		SpringApplication.run(ScopeAnnotationApplication.class, args);
	}

}
/*
@sdope Anotasyonu

1)
"singleton" (Varsayzlan) -> Her bir IoC Container için sadece bir tane nesne olusturulur.
KULLANIM : @Scope (ConfigurableBeanFactory. SCOPE_SINGLETON)
@Scope ("singleton")
2)
"prototype" - > Her injection isleminde yeni nesne olusturulur.
KULLANIM : @Scope (ConfigurableBeanFactory. SCOPE_PROTOTYPE)
@Scope ("prototype")
3)
"request" -> Her HTTP request'i için yeni bir nesne olusturulur.
KULLANIM : @RequestScope
@Scope (value = WebApplicationContext. SCOPE_REQUEST, proxyMode = ScopedProxyMode. TARGET_CLASS)
4)
"session" -> Her HTTP session'ı için bir nesne olusturulur.
KULLANIM @SessionScope
@Scope (value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode. TARGET_CLASS)

5)
"global-session" -> Her global HTTP session'1 için bir tane nesne olusturulur. Portlet uygulamalar için kullanilir.
KULLANIM : @Scope (scopeName = WebApplicationContext. SCOPE_GLOBAL_SESSION, proxyMode = ScopedProxyMode. TARGET_CLASS)
6)
"application" - > Tüm uygulama icerisinde sadece bir tane olusturulur.
KULLANIM @ApplicationScope
@Scope (value = WebApplicationContext. SCOPE_APPLICATION, proxyMode = ScopedProxyMode. TARGET_CLASS)
7)
"websocket" -> Her Websocket yasam döngüsü için sadece bir tane nesne olusturulur.
KULLANIM : @Scope (scopeName = "websocket", proxyMode = ScopedProxyMode. TARGET_CLASS)

*/