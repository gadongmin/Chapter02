package com.javaex.ex05;

public class GoodsApp {
	public static void main(String[] args) {
		//메모리 올리고
		Goods camera = new Goods();
		Goods cup = new Goods();
		Goods LGgram = new Goods();
		
		//니콘
		camera.setName("니콘");
		camera.setPrice(400000);
		//머그컵
		cup.setName("머그컵");
		cup.setPrice(2000);
		//LG그램
		LGgram.setName("LG그램");
		LGgram.setPrice(1000000);
		
		//니콘출력
		String name = camera.getName();
		int price = camera.getPrice();
		camera.showInfo();
		
		/*
		System.out.println("======================");
		System.out.println("이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("======================");
		System.out.println("----------------------");
		*/
		
		//머그컵출력
		String name1 = cup.getName();
		int price1 = cup.getPrice();
		cup.showInfo();
		/*
		System.out.println("======================");
		System.out.println("이름: " + name1);
		System.out.println("가격: " + price1);
		System.out.println("======================");
		System.out.println("----------------------");
		*/
		
		//LG그램 출력
		String name2 = LGgram.getName();
		int price2 = LGgram.getPrice();
		LGgram.showInfo();
		/*
		System.out.println("======================");
		System.out.println("이름: " + name2);
		System.out.println("가격: " + price2);
		System.out.println("======================");
		System.out.println("----------------------");
		*/
	}
}
