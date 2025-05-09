package com.javaex.ex26;

import java.io.IOError;
import java.io.IOException;

public class MyFile {
	// 필드

	// 생성자

	// 메소드-gs

	// 메소드-일반
	// 파일 정상적이 경우
	public String read(String path) {
		// path의 파일을 찾는다 C:\javaStudy\java\노래.txt
		// 파일의 내용을 읽어서 변수에 담는다
		String result = "학교종이 땡땡땡 어서모이자";

		return result;
	}

	// 파일이 없는 경우 예외처리
	public String read2(String path) {
		try {
			// path의 파일을 찾는다 C:\javaStudy\java\노래.txt
			// 파일의 내용을 읽어서 변수에 담는다
			throw new IOException();
			// 파일이 없는 상황을 강제로 만듬

		} catch (IOException e) {
			System.out.println("no file");

		}
		return "";

	}

	// 파일이 없는 경우 예외처리 하지 않고 통보만 진행
	public void read3(String path) throws IOException{

			throw new IOException();
			// 파일이 없는 상황을 강제로 만듬


	}
}
