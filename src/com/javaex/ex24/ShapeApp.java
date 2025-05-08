package com.javaex.ex24;

public class ShapeApp {

	public static void main(String[] args) {
		// Shape[] sArr = new Shape[4];
		Drawable[] dArr = new Drawable[4];

		Drawable dp = new Point(5, 100);
		Drawable dt = new Triangle("빨강", "빨강", 10, 20);
		Drawable dr = new Ractangle("초록", "초록", 10, 200);
		Drawable dc = new Circle("파랑", "파랑", 5);

		dArr[0] = dt;
		dArr[1] = dr;
		dArr[2] = dc;
		dArr[3] = dp;

		// 한번에 그리기
		for (int i = 0; i < dArr.length; i++) {
			dArr[i].draw();
		}
		// dp가 Drawable 출신인지 확인, true/false로 출력됨
		System.out.println(dp instanceof Drawable);
		// dp가 Point 출신인지 확인, true/false로 출력됨
		System.out.println(dp instanceof Point);
		// dp가 Shape 출신인지 확인, true/false로 출력됨
		System.out.println(dp instanceof Shape);

		// 한번에 면적 구하기
		for (int i = 0; i < dArr.length; i++) {
			if (dArr[i] instanceof Shape) { // Shape 출신이면 면접을 구할수 있음.
				((Shape) dArr[i]).area();
			}
		}
	}

}
