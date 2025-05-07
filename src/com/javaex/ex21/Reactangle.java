package com.javaex.ex21;

public class Reactangle {
	// 필드
	private String fillColor;
	private String lineColor;
	private int width;
	private int hight;

	// 생성자
	public Reactangle() {
	}

	public Reactangle(String fillColor, String lineColor, int wight, int hight) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.width = wight;
		this.hight = hight;
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

	public int getWight() {
		return width;
	}

	public void setWight(int wight) {
		this.width = wight;
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
		return "Reactangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", hight=" + hight
				+ "]";
	}
	
	public void draw() {
		System.out.println("========== 사각형을 그렸습니다 ==========");
		System.out.println("가로: " + width);
		System.out.println("세로: " + hight);
		System.out.println("면색: " + fillColor);
		System.out.println("선색: " + lineColor);
		System.out.println("===================================");
		
	}

}
