package com02;

import java.io.*;
// if 문을 써서 연산자를 일일이 다 지정 해 줘야 


public class IfEx005 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n, m, sum =0;
		char i;
		
		System.out.print("첫번째 정수 입력 : ");
		 n= Integer.parseInt(br.readLine());
          
		 System.out.print("연산자 : ");
		 i = (char)System.in.read();
		  	 
		System.out.print("두번째 정수 입력 : ");
		m = Integer.parseInt(br.readLine());
		
		if (sum=='+') {
			System.out.printf("%d c% d% d%", n, i,m,(i+m));
		}else if (sum=='-') {
			System.out.printf("%d c% d% d%", n, i,m,(i-m));
		}else if  (sum=='*') {
			System.out.printf("%d c% d% d%", n, i,m,(i*m));
		}else if  (sum=='/') {
			System.out.printf("%d c% d% d%", n, i,m,(i/m));
		}else {
			System.out.println("문자를 입력해 주세요 ");
		}
		
		
	}
	

}
