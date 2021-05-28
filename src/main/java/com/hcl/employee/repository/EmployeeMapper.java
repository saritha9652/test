package com.hcl.employee.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hcl.employee.beans.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEmpid(rs.getInt(1));
		e.setEmpname(rs.getString(2));
		e.setDepartment(rs.getString(3));
		e.setSalary(rs.getInt(4));
		return e;
	}

}
