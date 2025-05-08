package com.javaex.ex23;

public class ShapeApp {

	public static void main(String[] args) {
		Shape[] sArr = new Shape[4];

		Shape t = new Triangle("빨", "빨", 5, 3);
		Shape r = new Ractangle("노", "노", 10, 10);
		Shape c = new Circle("파", "파", 5);

		sArr[0] = t;
		sArr[1] = r;
		sArr[2] = c;

		// 포인트 추가
		Shape p = new Point(5, 5);
		sArr[3] = p;

		// 그리기
		for (int i = 0; i < sArr.length; i++) {
			sArr[i].draw();
		}

		// 넓이 출력
		for (int i = 0; i < sArr.length; i++) {
			sArr[i].area(); // 논리적이지 않은 문법(포인트는 임의값으로 출력됨), 면적이 없어도 부모클래스의 면적값이 들어가는 부작용이 생김.
		}

	}

}
