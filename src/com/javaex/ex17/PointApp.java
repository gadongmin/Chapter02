package com.javaex.ex17;

public class PointApp {

	public static void main(String[] args) {
		
		Point[] pArr = new Point[3];

		Point p01 = new Point(5, 5);
		Point p02 = new Point(10, 10);
		Point p03 = new Point(20, 20);

		pArr[0] = p01;
		// System.out.println(p01.toString());
		pArr[1] = p02;
		// System.out.println(p02.toString());
		pArr[2] = p03;
		// System.out.println(p03.toString());

		for (int i = 0; i < pArr.length; i++) {
			pArr[i].draw();
		}

	}

}
