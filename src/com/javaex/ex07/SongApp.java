package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		Song iu = new Song();
		Song bigbang = new Song();
		Song busker = new Song();
		
		
		iu.setArtist("아이유");
		iu.setTitle("좋은날");
		iu.setAlbum("Real");
		iu.setYear(2010);
		iu.setTrack(3);
		iu.setComposer("이민수");

		bigbang.setArtist("BIGBANG");
		bigbang.setTitle("거짓말");
		bigbang.setAlbum("Always");
		bigbang.setYear(2007);
		bigbang.setTrack(2);
		bigbang.setComposer("G-DRAGON");

		busker.setArtist("버스커버스커");
		busker.setTitle("벚꽃엔딩");
		busker.setAlbum("버스커버스커 1집");
		busker.setYear(2012);
		busker.setTrack(4);
		busker.setComposer("장범준");
		
		
		iu.showInfo();
		bigbang.showInfo();
		busker.showInfo();

	}

}
