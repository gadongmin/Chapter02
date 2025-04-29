package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		Point p01 = new Point();
		p01.setX(5);
		p01.setY(20);
//		System.out.println(p01.getX());
//		System.out.println(p01.getY());
		p01.draw();
		
		Point p02 = new Point();
		p02.setX(10);
		p02.setY(23);
//		System.out.println(p02.getX());
//		System.out.println(p02.getY());
		p02.draw();		
		
	}

}
