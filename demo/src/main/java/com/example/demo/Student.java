package com.example.demo;

public class Student {

	private String name;
	public Student(String name, int age, String branch) {
		
		this.name = name;
		this.age = age;
		this.branch = branch;
	}

	private int age;
	private String branch;
	

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
