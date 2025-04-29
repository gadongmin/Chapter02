package com.javaex.ex02;
// 틀 = class
public class Goods {
	// 필드
	private String name;
	private int price;
	
	// 생성자
	
	// 메소드 
	// name값 입력
	public void setName(String name){
		// n이 "니콘"
		// 위에 있는 name 입력
		this.name = name;
		//return이 필요없는 경우 = void 사용
	}
	// name값 읽어오기
	public String getName() {
		return name;
	}
	// price값 입력	
	public void setPrice(int price) {
		this.price = price;
	}
	// price값 읽어오기	
	public int getPrice() {
		return price;
	}
	
}
