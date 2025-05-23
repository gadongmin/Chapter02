package com.javaex.ex20;

public class ColorPoint extends Point {
	// 필드
	private String color;

	// 생성자
	public ColorPoint() {
	}

	public ColorPoint(String color) {
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	// 메소드-gs
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 메소드-일반
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}

	public void showInfo() {
		System.out.println("==========");
		System.out.println("x=" + super.x);
		System.out.println("y=" + super.y);
		System.out.println("color=" + this.color);
		System.out.println("==========");
	}
}

