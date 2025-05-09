package com.javaex.ex25;

import java.util.Scanner;

public class Ex01 {
	// 필드

	// 생성자

	// 메소드-gs

	// 메소드-일반
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = 0;
		int num = sc.nextInt();

		try {
			result = 100 / num;
		} catch (ArithmeticException e) {
			// System.out.println(e.toString());
			System.out.println(num + "으로 나눌수 없습니다.");
		} finally {
			System.out.println("공통영역");
		}

		System.out.println(result);

		sc.close();

	}

}
