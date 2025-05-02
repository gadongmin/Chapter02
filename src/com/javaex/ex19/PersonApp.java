package com.javaex.ex19;

public class PersonApp {
	public static void main(String[] args) {

		// Student가 extends Person 상속 전
		Student s01 = new Student();
		s01.setSchool("제주고등학교");
		// 이름 X
		// 나이 X
		System.out.println("----------------------------");

		// Student가 extends Person 상속 후
		Student s02 = new Student();
		s02.setSchool("서울고등학교");
		s02.setName("정우성");
		s02.setAge(22);
		System.out.println("----------------------------");

		Student s03 = new Student("이효리", 22, "제주고등학교");
		System.out.println(s03.toString());
		System.out.println("----------------------------");

		System.out.println(s03.getName());
		System.out.println(s03.getAge());
		System.out.println(s03.getSchool());

		s03.showInfo();
	}
}
