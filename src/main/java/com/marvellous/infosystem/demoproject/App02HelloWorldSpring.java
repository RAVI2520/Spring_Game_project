package com.marvellous.infosystem.demoproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
//		1 : Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
//		2 : Configure the things that we want spring to manage
//		   - @Configuration
		
//		3 : Retrieving beans managed by Spring  
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println("output of @Primary "+context.getBean(Address.class));
		System.out.println("Output of @Qualifier"+context.getBean("personQualifierExample"));

		
		
		
context.close();

	}

}
