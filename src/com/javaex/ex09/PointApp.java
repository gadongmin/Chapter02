package com.javaex.ex09;

public class PointApp {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(5);
		point1.setY(5);
		point1.draw();
		
		Point point2 = new Point();
		point2.setX(10);
		point2.setY(23);
		point2 .draw();

		
		Point point3 = new Point(5,5);
		point3 .draw();
		
		Point point4 = new Point(10,23);
		point4 .draw();
		

	}

}
