package com.objeEx;

public class Triangle extends shape {

	
	Point[] p =new Point[3];// 3개의 포인트
	
	
	public Triangle(Point[]p) {
		this.p = p;
	}
	
	@Override
	void draw() {
		System.out.printf("p1= %s, p2 =%s, p3=%s, color =%s%n",
				p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
	}
	
	
}
