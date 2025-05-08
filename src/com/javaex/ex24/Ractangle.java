package com.javaex.ex24;

public class Ractangle extends Shape implements Drawable {
	// 필드
	private int width;
	private int hight;

	// 생성자
	public Ractangle() {
	}

	public Ractangle(int width, int hight) {
		this.width = width;
		this.hight = hight;
	}

	public Ractangle(String fillColor, String lineColor, int width, int hight) {
		super(fillColor, lineColor);
		this.width = width;
		this.hight = hight;
	}

	// 메소드-gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	// 메소드-일반
	public void draw() { // interface로 구현
		System.out.println("사==========================");
		System.out.println("면색: " + super.fillColor);
		System.out.println("선색: " + super.lineColor);
		System.out.println("가로: " + this.width);
		System.out.println("세로: " + this.hight);
		System.out.println("===========================");
	}
	
	// 넓이 구하는 함수
	public void area() {
		System.out.println("사--------------------");
		System.out.println(width*hight);
		System.out.println("---------------------");
	}
}

