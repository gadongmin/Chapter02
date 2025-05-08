package com.javaex.ex23;

public class Point extends Shape {
	// 같은 배열에 넣기위해 Shape 상속, 부모의 필드값을 상속받지만 사용하지는 않는다.
	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드-gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드-일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void draw() {
		System.out.println("점==========================");
		System.out.println("x: " + this.x);
		System.out.println("y: " + this.y);
		System.out.println("===========================");
	}

	// 넓이 구하는 함수
	public void area() {
	}
}
