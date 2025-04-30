package com.javaex.ex07;

public class Song {
	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//생성자
	
	//메소드
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String gerArtist() {
		return this.artist;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbum() {
		return this.album;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getComposer() {
		return this.composer;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return this.year;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	public int getTrack() {
		return this.track;
	}
	
	public void showInfo() {
		System.out.println(artist+", "+title+"("+album+", "+year+", "+track+"번 track, "+composer+" 작곡)");
	}

}
	

