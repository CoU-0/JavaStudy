package com.objeEx;

public class Point {

	
	int x; // 0 
	int y;// 0 이 됨 
	
	public Point(int x , int y) {
		this.x =x;
		this.y =y;
		
	}
	public Point() {
		this(0,0);
	}
	
	public String getXY( ) { // x y 값을 문자열로 변환 
		return "("+x+","+y+")";
	}
	
	
}
