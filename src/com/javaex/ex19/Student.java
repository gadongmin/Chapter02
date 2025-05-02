package com.javaex.ex19;

public class Student extends Person { // 부모메소드와 연결용어(extends)

	// 필드
	private String school;

	// 생성자
	public Student() {
		System.out.println("Student(0)");
	}

	public Student(String school) {
		this.school = school;
		System.out.println("Student(1)");
	}

	public Student(String name, int age, String school) {
		super(name, age); // 상속메소드 용어(super)
		this.school = school;
		System.out.println("Student(3)");
	}

	// 메소드-gs
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	// 메소드-일반
	@Override
	public String toString() {
		return "Student [school=" + school + "]";
	}

	public void showInfo() {
		System.out.println("==========================");
		System.out.println("이 름: " + super.getName()); // 부모 private
		System.out.println("나 이: " + super.age); // 부모 protected
		System.out.println("학 교: " + this.school);
		System.out.println("==========================");
	}
}
