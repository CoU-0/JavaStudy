package com.objEx;

/*
 * varargs (veriable Arguments) 
 * 
 * 		-메소드 정의시 통일된 인자의 자료형에 '...'로 명시 함으로 이를 통한 
 * 		 메소드를 수행할때 필요한 인자의 수를 유연하게 구연할 수 있다. 
 * 			( 내부적으로 배열화 작업을 자동으로 해주기 때문에 가능하다. )
 * 
 * 
 * 
 */


public class MethodEx05 {

	public static void argExam(String ... n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println("n["+i+"] :" +n[i]);
		
		}
		System.out.println("---------------------------");
		
	}
	
	public static void main(String[] args) {
		argExam("Love", "Like");
		argExam("100", "600","900","1000"); // 공간을 자동으로 늘려줌 
		
		
	}

}
