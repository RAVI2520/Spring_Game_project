package com.marvellous.infosystem.demoproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age ,Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Raviraj";
	}

	@Bean
	public Integer age() {
		return 26;
	}

	@Bean
	public Address address() {
		return new Address("Rajgad Society", "pune");
	}

	@Bean
	public Person person() {
		var person = new Person(name(), age(),address());
//		person.age();
//		person.name();
		return person;

	}

}