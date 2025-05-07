package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		Triangle t01 = new Triangle("빨강", "검정", 10, 5);
		System.out.println(t01.toString());
		t01.draw();

		Rectangle r01 = new Rectangle("빨강", "검정", 10, 5);
		System.out.println(r01.toString());
		r01.draw();

		Circle c01 = new Circle("초록", "검정", 10);
		System.out.println(c01.toString());
		c01.draw();

		System.out.println("-----------------------------------");
		Shape st = new Triangle("초록", "초록", 100, 100);
		Shape sc = new Circle("빨강", "빨강", 50);
		Shape sr = new Rectangle("노랑", "노랑", 33, 33);

		// 하나의 배열에 모든 도형을 담는다, 다만 자식쪽 기능은 사용 불가
		Shape[] sArr = new Shape[3];
		sArr[0] = st;
		sArr[1] = sc;
		sArr[2] = sr;

		for (int i = 0; i < sArr.length; i++) {
			sArr[i].draw();
		}

	}

}