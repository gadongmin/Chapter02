package com.javaex.ex14;

public class GoodsApp {
	
	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
		
		System.out.println(camera.getCount());

		
		Goods cup = new Goods("머그컵", 2000);
		cup.showInfo();
		
		System.out.println(camera.getCount());
		

	}

}
