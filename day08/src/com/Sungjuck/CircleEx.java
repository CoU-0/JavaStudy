package com.Sungjuck;

public class CircleEx {

	public static void main(String[] args) {
		
		Circle pizza; // 참조 변수  선언 
		pizza = new Circle(); // 스테틱이 없으니 서클이라는 객체 생성 
		pizza.radius = 10; //피자 사이즈 
		pizza.name = "자바피자";// 피자이름
		
		double area = pizza.getArea(); // 피자의 크기를 계산  
		System.out.println(pizza.name+"의 크기는 "+area);
		System.out.println();
		
		Circle donut = new Circle(); // Circle 객체 생성 
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut. getArea();
		System.out.println(donut.name+"의 크기는 "+area);
		
	}

}
