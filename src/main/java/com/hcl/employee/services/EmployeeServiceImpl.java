package com.hcl.employee.services;

import java.util.List;

import com.hcl.employee.beans.Employee;
import com.hcl.employee.exception.EmployeeException;
import com.hcl.employee.repository.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDAO emp=new EmployeeDAO();
	public Employee addEmployee(Employee e) throws EmployeeException {
		// TODO Auto-generated method stub
		return emp.addEmployee(e);
	}
	public void deleteEmployee(int id) throws EmployeeException {
		// TODO Auto-generated method stub
		emp.deleteEmployee(id);
	}

	public void updateEmployee(String department, int id) throws EmployeeException {
		// TODO Auto-generated method stub
		emp.updateEmployee(department,id);
	}
	public List<Employee> displayEmployee(){
		
		return emp.displayEmployee();
	}

	public List<Employee> searchEmployee(String name) {
		// TODO Auto-generated method stub
		return emp.searchEmployee(name);
	}

}
