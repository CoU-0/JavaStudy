package com02;

import java.io.*;


/*
 * 
 * 
 * 
 * 
 * 
 */



public class IfEx11 {

	public static void main(String[] args)throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c;
		int temp; // 임시로 저장할 공간을 임의로 만들어 
		
		
		System.out.println("첫번째 정수 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.println("두번째 정수 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.println("세번째 정수 : ");
		c = Integer.parseInt(br.readLine());
		
		if ( a> b) {
			// 첫번째 정수가 두번째 정수보다 큰 경우 자리를 바꾼다.
			// 두 정수의 자리를 바꾼다. 	
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
			
		}
		
		if (a > c) {
			// 첫번째 정수가 세번째 정수보다 크면 자리 바꾼다.
			a = a ^ c;
			c = c ^ a;
			a = a ^ c;
			
			
		}
		if (b > c) { 
			// 두번째 정수가 세번째 정수보다 크면 자리를 바꾼다. 
			b = b ^ c;
			c = c ^ b;
			b = b ^ c;
			
			
			
		}
		System.out.println(" 결과  : "+a+","+b+","+c);
		
		
		
		
	}

}
