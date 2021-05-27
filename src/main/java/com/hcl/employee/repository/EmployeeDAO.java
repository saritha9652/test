package com.hcl.employee.repository;


import java.util.ArrayList;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.hcl.employee.beans.Employee;
import com.hcl.employee.exception.EmployeeException;
import com.hcl.employee.util.DBConnection;

public class EmployeeDAO {
	
	JdbcTemplate template=DBConnection.getConnection();
	public Employee addEmployee(Employee e) throws EmployeeException {
		// TODO Auto-generated method stub
		if(!searchById(e.getEmpid())) {
		String sql="insert into Employee values(?,?,?,?)";
		template.update(sql, e.getEmpid(),e.getEmpname(),e.getDepartment(),e.getSalary());
		return e;
		}
		else {
			throw new EmployeeException("Id alresdy exists");
		}
	}
	public void deleteEmployee(int id) throws EmployeeException {
		// TODO Auto-generated method stub
		String sql="delete from Employee where id=?";
		template.update(sql, id);
		
	}
	public void updateEmployee(String department, int id) throws EmployeeException {
		// TODO Auto-generated method stub
	
		String sql="update Employee set department=? where id=?";
		template.update(sql, department,id);
	}
	public boolean searchById(int id) {
		String sql="select id,empname,department,salary from employee where id=?";
		List<Employee> list=template.query(sql, new EmployeeMapper(),id);
		if(list.size()==0)
			return false;
		else
		return true;
		
	}
	public List<Employee> displayEmployee(){
		
		String sql="select id,empname,department,salary from employee";
		return template.query(sql, new EmployeeMapper());
		
		}
	public List<Employee> searchEmployee(String name) {
		String sql="select id,empname,department,salary from Employee where empname=?";
		return template.query(sql, new EmployeeMapper(),name);
	}
	
}
