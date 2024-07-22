package com.Sungjuck;

public class Circle {

	int radius; // 원의 반지름 필드
	String name; // 원의 이름 필드 
	
	public Circle() {}
		
	public double getArea(){
		//원의 면적 
		return radius*radius*3.14; 
	}
	
}
