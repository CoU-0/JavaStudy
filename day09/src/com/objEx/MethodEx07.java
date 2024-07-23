package com.objEx;

/*
 * 문 ] 
 * 메소드 팩토리얼의 매개변수 n이 음수이거나 20보다 크면 -1을 반환하는 프로그램이다. 
 * 
 * 
 */

public class MethodEx07 {
	static long factorial(int n) {  // long는 자료형 
		if (n <=0 || n > 20 ) return -1;   // -1을 반화하면 끝난다는 의미 
		if ( n <=1) return 1;
		return n *factorial(n-1);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int n = 21; 
		long result= 0;
		
		for(int i = 1; i <= n; i++ ) {
			result = factorial(i);
			
			if (result == -1) {
				System.out.printf("유효하지 않은 값입니다.(0<n <=20): %d%n",n);
				break;
			}
			System.out.printf("%2d! = %20d%n", i, result);
		}
		
		
		
		
	}

}
