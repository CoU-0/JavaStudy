package com02;

import java.io.*;

/*
 * 문]
 * 입력받은 수가 3의 배수인지 판별하는 프로그램을 구현해라 
 * 
 * 정수입력 : 129
 * 
 * */


public class IfEx04 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 입력 : ");
		
		int n = Integer.parseInt(br.readLine());
     
		if (n%3 == 0) {
				System.out.println("정수는 3의 배수입니다.");
			
		}else {
			System.out.println( n+"은 3의 배수가 아닙니다.");
	
			
		}
		
		

	}

}
