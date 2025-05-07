package com.javaex.ex22;

public class Triangle extends Shape {
	// 필드
	private int width;
	private int hight;

	// 생성자
	public Triangle() {
	}
	/*
	public Triangle(int width, int hight) {
		this.width = width;
		this.hight = hight;
	}
	*/
	public Triangle(String fillColor, String lineColor, int width, int hight) {
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
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", hight=" + hight + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}

	public void draw() {
		System.out.println("========== 삼각형을 그렸습니다 ==========");
		System.out.println("면색: " + super.fillColor);
		System.out.println("선색: " + super.lineColor);
		System.out.println("가로: " + this.width);
		System.out.println("세로: " + this.hight);
		System.out.println("===================================");
	}

}
