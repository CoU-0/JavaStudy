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



public class IfEx010 {

public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c=0;
		
		
		System.out.println("첫번째 정수 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.println("두번째 정수 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.println("세번째 정수 : ");
		c = Integer.parseInt(br.readLine());
		
		if (a>b) {
				if (b>c) {
					System.out.println(a+"=>"+b+"=>"+c);				
				}else {
					System.out.println(a+"=>"+c+"=>"+b);		
				}
		
		if (b>a) {
			if (a>c) {
				System.out.println(b+"=>"+a+"=>"+c);				
			}else {
				System.out.println(b+"=>"+c+"=>"+a);		
			}
		}
		if (c>a) {
			if (a>b) {
				System.out.println(c+"=>"+a+"=>"+b);				
			}else {
				System.out.println(c+"=>"+b+"=>"+a);		
			}
		}
	
	}
}
}
