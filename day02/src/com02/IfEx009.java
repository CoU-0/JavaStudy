package com02;

import java.io.*;


/*
 *문]
 *두 정수를 입력받아 큰수를 출력하는 프로그램을 구현한다. 
 * 
 *첫번째 정수 = 5 
 *두번째 정수 = 2
 * 세번째 정수 =
 * 
 *  큰수 : 5 작은수 : 2 
 * 
 * 앞 뒤 비교 관계 연산자 - if문 
 * 
 * 
 */




public class IfEx009 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c=0;
		
		
		System.out.println("첫번째 정수 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.println("첫번째 정수 : ");
		b = Integer.parseInt(br.readLine());
		
		if (a>b) {
			System.out.println("첫번째 정수"+a+"가 두번째 정수"+b+"보다 큰수 입니다.");
		}else {
			System.out.println("첫번째 정수"+a+"가 두번째 정수"+b+"보다 작은 수 입니다.");
		
		}
		
		
		
		
	}

}
