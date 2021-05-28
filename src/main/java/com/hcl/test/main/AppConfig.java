package com.hcl.test.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hcl.test.beans.Address;
import com.hcl.test.beans.Employee;
@Configuration
public class AppConfig {

	@Bean
	public Address adr() {
		System.out.println("address");
		return new Address();
	}
	@Bean
	public Employee emp() {
		System.out.println("employee");
		return new Employee();
	}
	
}
