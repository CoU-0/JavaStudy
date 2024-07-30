package com.interex;

/*
 * 
 * 인터페이스 내에는 상수 또는 추상 메소드만 가능함
 * 그리고 인터페이스를 사용하기 위해서는 일반 클래스에서
 * 구현(implements) 력을 가져야 함, 다시 말해서 일반클래 implements라는 예약어로
 * 특정 인터페이스 구현하겠다고 명시하는 것을 의미함
 * 인터페이스가 가지는 추상메소드들은 구현 받은 클래스에서
 * 하나도 빠짐없이 (모두) 재정의 해야함
 * 
 * 
 */
public class InterfaceEx implements InterEx {

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return A;
	}

	public static void main(String[]args) {
		InterfaceEx ii=new InterfaceEx();
		System.out.println("getA():"+ii.getA());
		
		
		
	}
}
