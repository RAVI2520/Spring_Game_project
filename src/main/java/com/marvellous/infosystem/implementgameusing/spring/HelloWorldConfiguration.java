package com.marvellous.infosystem.implementgameusing.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
	public Address addressPune() {
		return new Address("Rajgad Society", "pune");
	}
	
	@Bean
	@Primary
	public Address addressAhmednagar() {
		return new Address("Wadgaon Gupta", "Ahemdnagar");
	}
	
	@Bean
	@Qualifier("address3qualifier")
	public Address address2Shevgaon() {
		return new Address("Bhavinimgaon", "Ahmednagar");
	}

	@Bean
	public Person person() {
		var person = new Person(name(), age(),address2Shevgaon());
//		person.age();
//		person.name();
		return person;

	}
	
	@Bean
	public Person personQualifierExample(@Qualifier("address3qualifier") Address address) {
		return new Person(name() ,age(),address);
	}
	
	@Bean 
	public Person personExamplePrimaryAddress(Address address) {
		return new Person(name(),age(),address);
	}
	
//	@Bean
//	@Primary
//	public Person personQualifierExample() {
//		return new Person(name() ,age(),address);
//	}
	

}