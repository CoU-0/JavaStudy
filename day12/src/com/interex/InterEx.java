package com.interex;
/*
 * 인터페이스
 * - 일종의 추상클래스이다
 *   인터페이스는 추상클래스처럼 추상메소드를 갖지만 추상클래스보다 추상화 정도가
 *   높아서 추상클래스와 달리 몸통을 갖춘 일반 메소드 또는 멤버변수를 가질수 없다.
 *   인터페이스는 오로지 추상메소와 상수만을 멤버로 가질 수 있으며 
 *                   그외 어떤 요소도 허용하지 않는다.
 *                   
 *                   
 * 
 *  인터페이스 제약조건 
 *   -모든 멤버변수는 public static final이어야하며 이를 생략할 수 있음
 *   -모든 메소드는 public abstract이어야 하며 이를 생략할 수 있음
 *    단, static 메소드와 기본 메소드는 제외함
 *    
 * 
 */
public interface InterEx {

	 static final int A=100;
	    int getA(); //  abstract 생략 가능
	    
}
