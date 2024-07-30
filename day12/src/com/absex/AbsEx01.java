package com.absex;
/*
 * 
 * 추상클래스의 상속관계
 *  -추상클래스간의 상속이 가능하다.
 *   일반클래스들간의 상속과 유사하지만 추상클래스간의 상속에서는
 *   상속받은 추상메소드들을 꼭 재정의 할 필요는 없다.
 *   이때 재정의 하지 못했던 추상메소드들은 일반클래스에 상속될때
 *   모두 재정의 해도 됨
 *   
 */
public abstract class AbsEx01 {

	int a=100;
	final String str="abstract test";// 상수
	public String getStr() { // 일반 메소드
		return str;
	}
	
	// 추상메소드 : 몸체가 없는 메소드
	abstract public int getA();
	
	
	
	
}
