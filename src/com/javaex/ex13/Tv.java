package com.javaex.ex13;

public class Tv {
	// 필드
	private int channel;
	private int volume;
	private boolean power;
	
	// 생성자
	public Tv() {
		
	}
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	// 메소드-gs
	public int getChannel() {
		return this.channel;
	}

	public int getVolume() {
		return this.channel;
	}

	public boolean getPower() {
		return this.power;
	}
	
	// 메소드-일반
	public void setPower(boolean on) {
		if(on == true) {
			power = true;
			this.channel = 7;
			this.volume = 20;
		}else {
			power = false;
			this.channel = 0;
			this.volume = 0;
		}
	}
	public void setChannel(int channel) {
		if(channel < 1 || channel > 255) {
			this.channel = 7;
		}else {
			this.channel = channel;
		}
	}
	public void setChannel(boolean up) {
		if(up==true) {
			this.channel = ++channel;
		}else {
			this.channel = --channel;
		}
	}
	
	public void setVolume(int volume) {
		if(volume < 1 || volume > 100) {
			this.volume = 100;
		}else {
			this.volume = volume;
		}		
	}
	public void setVolume(boolean up) {
		if(up==true) {
			this.volume = ++volume;
		}else {
			this.volume = --volume;
		}
	}
	public void status() {
		System.out.println("파워: " + power + "   채널: " + channel + "   볼륨: " + volume);
	}
}

