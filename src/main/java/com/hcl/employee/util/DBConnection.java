package com.hcl.employee.util;

import java.sql.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class DBConnection {
	public static JdbcTemplate getConnection() {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate=(JdbcTemplate) context.getBean(JdbcTemplate.class);
		return jdbcTemplate;
	}
}
