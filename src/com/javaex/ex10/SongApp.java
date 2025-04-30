package com.javaex.ex10;

public class SongApp {

	public static void main(String[] args) {
		
		Song iu = new Song("아이유", "좋은날", "Real", 2010, 3, "이민수");
		iu.showInfo();
		
		System.out.println("================================================");
		
		Song bigbang = new Song();
		bigbang.setA("BIGBANG");
		bigbang.setT("거짓말");
		bigbang.setB("Always");
		bigbang.setY(2007);
		bigbang.setK(2);
		bigbang.setC("G-DRAGON");
		bigbang.showInfo();
		
		System.out.println("================================================");
		
		Song busker = new Song("버스커버스커","벚꽃엔딩","버스커버스커 1집", 2012, 4);
		busker.setC("장범준");
		busker.showInfo();

		System.out.println("================================================");
		
		Song s01 = new Song("버스커버스커","벚꽃엔딩","버스커버스커 1집", 2012, 4, "장범준");
		s01.showInfo();
	}

}
