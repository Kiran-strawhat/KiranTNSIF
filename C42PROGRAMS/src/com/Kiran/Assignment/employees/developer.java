package com.Kiran.Assignment.employees;

public class developer extends Employee{
	 private String programmingLanguage;

	 public developer(String name, int employeeId, double salary, String programmingLanguage) {
	     super(name, employeeId, salary);
	     this.programmingLanguage = programmingLanguage;
	 }

	 public String getProgrammingLanguage() {
	     return programmingLanguage;
	 }

	 public void setProgrammingLanguage(String programmingLanguage) {
	     this.programmingLanguage = programmingLanguage;
	 }
}
