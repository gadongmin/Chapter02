package com.javaex.ex10;

public class Song {
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//생성자
	//기본(자동)
	public Song() {
		System.out.println("(0)");
	}
	
	//자료형 2개 String-String으로 인식	
	public Song(String artist, String title) {
		this.artist = artist;
		this.title = title;
		System.out.println("(2)");
	}
	/* 자료형 2개 String-String 같은 타입으로 인식하여 오류	
	public Song(String title, String album) {
		this.title = title;
		this.album = album;
		System.out.println("(2-1)");
	}
	*/
	
	//위와 자료형 2개는 같지만, String-int으로 인식	
	public Song(String artist, int track) {
		this.artist = artist;
		this.track = track;
		System.out.println("(5)");
	}
	
	//5개	
	public Song(String artist, String title, String album, int year, int track) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.track = track;
		System.out.println("(5)");
	}
	//6개
	public Song(String artist, String title, String album, int year, int track, String composer) {
		// this() 키워드 : 다른 생성자 호출, 위 5개 생성자 호출된 상태    
		// * this.의 다른 의미임
		this(artist, title, album, year, track);
		this.composer = composer;
		System.out.println("(6)");
	}
	//메소드 - gs
	public void setT(String title) {
		this.title = title;
	}
	public String getT() {
		return title;
	}
	
	public void setA(String artist) {
		this.artist = artist;
	}
	public String getA() {
		return artist;
	}
	public void setB(String album) {
		this.album = album;
	}
	public String getB() {
		return album;
	}
	public void setC(String composer) {
		this.composer = composer;
	}
	public String getC() {
		return composer;
	}
	public void setY(int year) {
		this.year = year;
	}
	public int getY() {
		return year;
	}
	public void setK(int track) {
		this.track = track;
	}
	public int getK() {
		return track;
	}
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println
		(artist+", "+title+"("+album+", "+year+", "+track+"번 track"+", "+composer+" 작곡)");
	}
}
