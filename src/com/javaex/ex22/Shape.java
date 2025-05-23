package com.javaex.ex22;

public abstract class Shape { // abstract가 있으면 메모리에 올리지 못함
	// 필드
	protected String fillColor;
	protected String lineColor;

	// 생성자
	public Shape() {

	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	// 메소드-gs
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	// 메소드-일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	// 부모-자식간에 변수 이름이 같을때, 오버라이딩 적용
	/*
	public abstract void draw() {
		System.out.println("Shape draw()");
	}
	*/
	
	public abstract void draw(); // 메소드 오버라이딩용(자식클래스에 있는 draw를 덮어쓰는 장치)
	// 코드를 작성하지 못하기 때문에 자식클래스에 꼭 작성되어야 한다.
}
