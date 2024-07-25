package com.objeEx;

public class MP3Phone extends Cellphone { // 자식 클래스 

	int size; // 저장공간 만듦 
	// 아니면 여기에 계속 써야함 -> 상속의 특징인 코드의 간결성 
	
	
	public MP3Phone(String model, String number, int chord, int size) {
		this.model = model;
		this.number = number;
		this.chord = chord;
		this.size = size;
		
	}

}
