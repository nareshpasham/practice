package com.practice.java8features.predicate;

public class Employee {
	private String empName;
	private int empId;
	private String empAddress;
	private int age;

	public String getEmpName() {
		return empName;
	}

	public Employee(String empName, int empId, String empAddress, int age) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAddress = empAddress;
		this.age = age;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empAddress=" + empAddress + ", age=" + age
				+ "]";
	}

}
