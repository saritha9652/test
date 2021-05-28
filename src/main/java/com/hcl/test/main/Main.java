package com.hcl.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hcl.test.beans.Address;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Address a=(Address) context.getBean("adr");
		a.setHouseNo("abc");
		a.setCity("Bangalore");
		a.setState("karnataka");
		System.out.println(a);
	}

}
