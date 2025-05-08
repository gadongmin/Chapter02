package com.javaex.ex24;

public class Circle extends Shape implements Drawable {
	// 필드
	private int radius;

	// 생성자
	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	// 메소드-gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메소드-일반
	public void draw() { // interface로 구현
		System.out.println("원==========================");
		System.out.println("면색: " + super.fillColor);
		System.out.println("선색: " + super.lineColor);
		System.out.println("반지름: " + this.radius);
		System.out.println("===========================");
	}

	// 넓이 구하는 함수
	public void area() {
		System.out.println("원--------------------");
		System.out.println(3.14*radius*radius);
		System.out.println("---------------------");
	}
}

