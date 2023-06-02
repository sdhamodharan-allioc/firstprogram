package com.learning.spring.beans;

public class Employee {

		private int employeeId;
		private String employeeName;
		private double salary;
		private Address address;

	public Employee() {
		super();
	}
	
	public Employee(int employeeId, String employeeName, double salary, Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.address = address;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", address=" + address + "]";
	}
	
	public String welcomeMessage() {
		System.out.println("Welcome message method .....");
		return this.toString();
	}
}
