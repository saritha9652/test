package com.hcl.employee.main;

import java.util.Scanner;

import com.hcl.employee.beans.Employee;
import com.hcl.employee.exception.EmployeeException;
import com.hcl.employee.services.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		EmployeeServiceImpl es=new EmployeeServiceImpl();
		while(true) {
			System.out.println("press 1 to add employee\n"
					+ "press 2 to display employees\n"
					+ "press 3 to delete employee\n"
					+ "press 4 to update employee\n"
					+ "press 5 to search employee\n"
					+ "press 6 to exit");
			int option=scan.nextInt();
			switch(option) {
			case 1: System.out.println("enter employee id");
					int id=scan.nextInt();
					System.out.println("enter employee name");
					String name=scan.next();
					System.out.println("enter department name");
					String department=scan.next();
					System.out.println("enter salary of employee");
					int salary=scan.nextInt();
					Employee e=new Employee();
					e.setEmpid(id);
					e.setEmpname(name);
					e.setDepartment(department);
					e.setSalary(salary);
				try {
					System.out.println(es.addEmployee(e));
				
				} catch (EmployeeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					break;
			case 2:System.out.println("displaying employees:");
					System.out.println(es.displayEmployee());
					break;
			case 3:System.out.println("delete employee:");
					System.out.println("enter id which ur going to delete:");
					int empId=scan.nextInt();
				try {
					es.deleteEmployee(empId);
				} catch (EmployeeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					System.out.println("employee deleted sucessfully");
					break;
			case 4:System.out.println("updating employee:");
					System.out.println("enter id in which you are going to update");
					int Id=scan.nextInt();
					System.out.println("enter updated department:");
					String dept=scan.next();
				try {
					es.updateEmployee(dept, Id);
				} catch (EmployeeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					System.out.println("updated depatment sucessfully:");
					break;
			case 5:System.out.println("searching for employee:");
					System.out.println("enter name of the employee whom you are going to search");
					String Name=scan.next();
					System.out.println(es.searchEmployee(Name));
					break;
			case 6:
				
				System.exit(1);
					break;
			default:System.out.println("enter correct option");
			}
		}
		

	}

}
