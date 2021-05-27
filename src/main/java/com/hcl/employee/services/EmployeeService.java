package com.hcl.employee.services;

import java.util.List;

import com.hcl.employee.beans.Employee;
import com.hcl.employee.exception.EmployeeException;

public interface EmployeeService {
	public Employee addEmployee(Employee e) throws EmployeeException;
	public void deleteEmployee(int id) throws EmployeeException;
	public void updateEmployee(String department,int id) throws EmployeeException;
	public List<Employee> displayEmployee();
	public List<Employee> searchEmployee(String name);
}
