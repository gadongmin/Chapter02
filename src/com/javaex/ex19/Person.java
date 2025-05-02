package com.javaex.ex19;

public class Person {

	// 필드
	private String name; // 모든 클래스에 거절
	protected int age; // 상속된 클래스에만 허용

	// 생성자
	public Person() {
		System.out.println("Person(0)");
	}

	public Person(String name, int age) {
		System.out.println("Person(2)");
		this.name = name;
		this.age = age;
	}

	// 메소드-gs
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

	// 메소드-일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
