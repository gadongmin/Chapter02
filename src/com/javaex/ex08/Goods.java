package com.javaex.ex08;

public class Goods {
	//필드
	private String name;
	private int price;
	
	//생성자 = 메모리에 올리는 작업
	//기본생성자(자동)
	// * 추가 오버로딩 발생 시 자동적용 취소
	public Goods() { 
	}
	//생성자 오버로딩
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//메소드
	public void setname(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("======================");
		System.out.println("이름:" + name);
		System.out.println("가격:" + price);
		System.out.println("======================");
	}

}

