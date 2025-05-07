package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		Triangle t01 = new Triangle("주황", "검정", 10, 5);
		System.out.println(t01.toString());
		t01.draw();
		
		Reactangle r01 = new Reactangle("빨강", "검정", 15, 10);
		System.out.println(r01.toString());
		r01.draw();
		
		Circle c01 = new Circle("초록", "검정", 12);
		System.out.println(c01.toString());
		c01.draw();
	}

}
