package com.javaex.ex06;

public class Point {
	// 필드
	private int x;
	private int y;
	
	// 생성자
	
	// 메소드 - gs
	// x 가 값 대입
	public void setX(int x) {
		this.x = x;
	}
	// x 가 읽기	
	public int getX() {
		return x;
	}
	// y 가 값 대입	
	public void setY(int y) {
		this.y = y;
	}
	// y 가 값 대입
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점[x="+ x + ", y=" + y + "]을 그렸습니다.");
	}
	
}
