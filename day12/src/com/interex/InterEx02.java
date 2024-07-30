package com.interex;
/*
 * 
 * 추상클래스와                        인터페이스의 차이점
 *  
 *  단일상속을 한다.                    다중상속이 가능하다.
 *  --------------------------------------------------------------
 * 
 * 추상클래스와 인터페이스의 공통점
 * 1. 객체를 생성할 수 없다.
 * 2. 반드시 상속해서 하위 클래스를 통해서 객체를 생성한다.
 *     메소드를 재정해야함
 *     
 * 
 * 
 */
public class InterEx02 implements Inter3 {

	int a=100;
	
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return a+10;
	}

	public static void main(String[] args) {
		InterEx02 it=new InterEx02();
				Inter1 it1= it; // 인터페이스의 다형성
				Inter2 it2=it;
				Inter3 it3=it;
				
				System.out.println(it1.getA());
				System.out.println(it2.getA());
				System.out.println(it3.getData());
	}

}
