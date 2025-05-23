package com.javaex.ex18;

public class Student {

	// 필드
	private String name;
	private int age;
	private String school;

	// 생성자
	public Student() {
	}

	public Student(String name, int age, String school) {
		this.name = name;
		this.age = age;
		this.school = school;
	}

	// 메소드 - gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	// 메소드 - 일반
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
	}
}
