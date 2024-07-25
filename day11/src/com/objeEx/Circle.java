package com.objeEx;


public class Circle extends shape   { //도형을 상속받ㅇ므 

	Point center;// 원의 원점좌표  --> x y 값이 나오고 반지름으로 원이 그려지게 
	int r;//
	
	
	public Circle() {
		this(new Point(0,0),100); // circle point center, int r
	}
	
	public Circle(Point center, int r) { // 오버라이딩 부모의 클래스에서 상속받은 메소드를 재정의 
	 this.center = center; // 원을 그리는 대식 원의 정보 출력
	 this.r = r; 
	}
	
	@Override
	void draw () {
		System.out.printf
		("[center = (%d,%d), r= %d, color = %s]%n", center.x, center.y,r,color);
	}
	
	
	
}
