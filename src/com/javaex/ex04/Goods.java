package com.javaex.ex04;

public class Goods {
	// 필드
	private String name;
	private int price;
	// 생성자
	
	// 메소드-gs,일반
	// name 등록
	public void setName(String name) {
		this.name = name;
	}
	// name 읽어오기
	public String getName() {
		return name;
	}
	
	// price 등록
	public void setPrice(int price) {
		this.price = price;
	}
	// price 읽어오기
	public int getPrice() {
		return price;
	}
}
