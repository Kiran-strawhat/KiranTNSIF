package com.Kiran.Assignment.Utilities;

import com.Kiran.Assignment.employees.Employee;

public class EmployeeUtitlities extends Employee{
	public EmployeeUtitlities(String name, int employeeId, double salary) {
		super(name,employeeId,salary);
		// TODO Auto-generated constructor stub
	}
	
    	
    	
    	
   
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }
}
