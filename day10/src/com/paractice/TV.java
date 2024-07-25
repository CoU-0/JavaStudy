package com.paractice;


public class TV {
	// 필드
	String model;
	int year;
	int inch; 
	//생성자
	
	public TV(String model, int year, int inch) {
	
		this.model = model;
		this.year = year;
		this.inch = inch;
	
	}

	//메소드
	public void show() {
		
		System.out.println(model +"에서 만든" +year +"년형"+ inch +"인치 TV");
	}
	
	public static void main(String[] args) {
		TV myTv = new TV("LG",2024,32);
		myTv.show();
		
		
	}

}


// 못했던게 초기화 하는것 / 그 이후에 출력하는 방법 
// 매소드 생성하는 방법 