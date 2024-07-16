package com;

/*
 * continue 
 * - 반복문을 빠져 나가지 않으면서 다음방법으로 넘어가고자 때 // 부분건너뛰기? 
 * 	  사용되는 제어문 
 * 
 *  return 
 *   - 현재 메소드를 종료하고 종료할때 사용되는 제어문 
 *   	현재 메소드가 void로 지정된 경우, 반환 값이 있는 경우로 나뉨 
 *   		 void 일경우 return문이 생략 
 *   		 반환 값이 있을 경우 리턴문이 필요하다. 
 * 
 * 
 * 
 * */

import java.util.*;




public class Exam03 {

	public static int add(int a, int b) { // return
		int c ; 
		c = a+b ;
		return c; 
	}
	
	public static void main(String[] args) { // void - 돌려질 값이 없다. int - 반환값 존재 
		Scanner sc = new Scanner(System.in);
		
		int n, s;
		
		System.err.println("정수 : ");
		n=sc.nextInt();
		
		if (n <1 ) {
			System.out.println("1 이상의 정수를 입력하셔야합니다");
			return; // 0 아래면 출력 
		}
		
		s=0;
		for (int i = 1; i<=n; i++)
			s +=n;
		
		System.out.println("결과"+s);

		
		
		
	}

}
