package com.stream.hard2;

public class WorkRecord {
	private String name;
	private String department;
	public WorkRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkRecord(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "WorkRecord [name=" + name + ", department=" + department + "]";
	}
	
}
