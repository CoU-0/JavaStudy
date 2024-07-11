package com02;

import java.io.*;


/*
 *문]
 *두 정수를 입력받아 큰수를 출력하는 프로그램을 구현한다. 
 * 
 *첫번째 정수 = 5 
 *두번째 정수 = 2
 * 세번째 정수 =4 
 * 
 *  5>= 4 >= 3 
 * 
 * 앞 뒤 비교 관계 연산자 - if문 
 * 
 * 
 */



public class IfEx10 {

public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c;
		int temp; // 임시로 저장할 공간을 임의로 만들어 
		
		
		System.out.println("첫번째 정수 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.println("두번째 정수 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.println("세번째 정수 : ");
		c = Integer.parseInt(br.readLine());
		
//		if (a>b) {
//				if (b>c) {
//					System.out.println(a+"=>"+b+"=>"+c);				
//				}else {
//					System.out.println(a+"=>"+c+"=>"+b);		
//				}
//		
//		if (b>a) {
//			if (a>c) {
//				System.out.println(b+"=>"+a+"=>"+c);				
//			}else {
//				System.out.println(b+"=>"+c+"=>"+a);		
//			}
//		}
//		if (c>a) {
//			if (a>b) {
//				System.out.println(c+"=>"+a+"=>"+b);				
//			}else {
//				System.out.println(c+"=>"+b+"=>"+a);		
//			}
//		}
//	
//	}
		
		// a가 b가 큰경우 --> 가정  
 			// c가
		
		
		if (b >= a && b>=c) {
				temp = a; // temp 라는 빈공간을 만들어 --> a가 temp에 저장됨 
				a=b;			// b가 a로 저장 
				b=temp;    // b가 temp에 저장되어있던 a 가 저장됨 
			
			
		}else if(c >= a && c >=b){
			
			temp = a; // 첫번째 정수가 임시공간에 저장 
			a =c; // 세번째 정수가 첫번째 정수가 저장공간에 저장됨 
			c = temp; // 임시공간에 저장된 정수가 세번째 정수가 저장된 공간에 저장됨 
			
			
		}

		
		// 
		
		
		if (c >=b) {
			temp =b;
			b=c;
			c=temp;
			
			
		}
		System.out.println(a+">="+b+">="+c);

}
}
