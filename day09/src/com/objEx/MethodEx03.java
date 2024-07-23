package com.objEx;

import java.io.*;
/*
 * 문 계산기 프로그램을 구현해라 단, 두 정수와 연산자를 입력받고 각각의 기능을 구현하여 출력하는 프로그램을 작성해라 메소드 명은
 *  plus, minus, multi, div, per
 * 
 * 결과 첫번째 정수 : 연산자 두번째 정수 :
 * 
 * 
 */



class Method03 { // 나중에는 언젠가 사라진다. 

	public static int plus(int i, int j) {
		// if (k == ''+'' ) {
		return i + j;
	}

	public static int minus(int i, int j) {
		return i - j;
	}
	public static int multi(int i, int j) {
		return i * j;
	}
	
	public static int div(int i, int j) {
		return i / j;
	}
	
	public static int per(int i, int j) {
		return i % j;
	}
	
	
	public static void display(int a, char b , int c, int d) {
		System.out.println();
		System.out.println(a+" " + b+" " +c+" = " +d );
	}
	
	
	
	

}

public class MethodEx03 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, sum=0;
		char op = 0;
		
		System.out.println("첫번째 정수 :");
		num1 = Integer.parseInt(br.readLine());

		
		do {
		System.out.println("연산자 :");
		op =(char) System.in.read();   // readLine.chatAt();
		System.in.read();
		System.in.read();
		}while (op !='+' && op !='-' &&op !='*' &&op !='%' &&op !='/');
	
			System.out.println("첫번째 정수 :");
		num2 = Integer.parseInt(br.readLine());
		
		switch(op) {
		case '+' :
			sum = Method03.plus(num1, num2);
			
			break;
			
		case '-' :
			sum = Method03.minus(num1, num2);
			break;
			
		case '*' :
			sum = Method03.multi(num1, num2);
			break;
			
		case '%' :
			sum = Method03.per(num1, num2);
			break;
			
		case '/' :
			sum = Method03.div(num1, num2);
			break;
		
		}
		Method03.display(num1, op, num2, sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
