package com.absex;
/*
 * 부모클래스의 추상메소드의 접근제한자는
 * private로 선언하면 안됨
 * 
 * private로 선언하면 안되는 이유
 * -자식이 오버라이딩을 해야하는데 못하게된다.
 * 
 * static으로 선언이 안됨
 * 이유:객체없이도 호출되는 static 메소드 이므로 
 *       반드시 몸체가 정의 되어야 클래스.메소드() 형식으로 호출할 수 있음
 *       
 * 
 * 
 */
public class Triangle extends Diagram {

	@Override
	void draw() {
		
		System.out.println("삼각형을 그리다."); // 오버라이딩
	}
	
	
}
