package com.readingcsvinjava;

import java.util.Date;

class Employee1 {
	private String name;
	private String hireDate;
	private String dept;

	public Employee1(String name, String hireDate, String dept) {
		this.name = name;
		this.hireDate = hireDate;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override public String toString() { return "Employee1 [name=" + name + ", hiredate=" + hireDate + ", dept=" + dept + "]"; }
}


