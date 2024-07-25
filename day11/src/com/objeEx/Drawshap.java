package com.objeEx;

public class Drawshap {

	public static void main(String[] args) {
		Point[] p = {
				new Point(100, 100),
				new Point(140, 50),
				new Point(200,300)
		};
		
		Triangle t = new Triangle(p);
		Circle c= new Circle(new Point(150, 150),50);
		
	}

}
