package com.javaex.ex15;

public class MathApp {
	// 메소드 일반
	public static void main(String[] args) {
		
		// Math math = new Math(); * 스태틱에 메소드를 올려서 필요없어짐
		// 반복사용되는 메소드는 스태틱에 올려서 메모리를 줄이는 것이 좋다.
		
		
		// 메소드 오버로딩
		System.out.println(Math.plus(5, 3));
		// 스태틱에 올린 메소드는 클래스명을 사용한다.
		// System.out.println(math.plus(5, 3)); - 스태틱에 메소드를 올리지 않았을 때
		
		System.out.println(Math.plus(5, 3.3));
		// System.out.println(math.plus(5, 3.3));
		
		System.out.println(Math.plus(3.3, 5));
		// System.out.println(math.plus(3.3, 5));
		
		System.out.println(Math.plus(3.3, 5.5));
		// System.out.println(math.plus(3.3, 5.5));
		
		System.out.println(Math.plus(3, 5.5));
		// System.out.println(math.plus(3, 5.5));
		
		// Math math = new Math(); , 스태틱에 메소드를 올리지 않았으면 필요함.
		System.out.println(Math.circleArea(5));

		
	}
		
}

