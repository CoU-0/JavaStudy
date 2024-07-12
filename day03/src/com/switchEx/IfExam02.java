package com.switchEx;

import java.io.*;


/*
 * 사용자로부터 알파벳 한문자를 입력받아 소문자를 입력 했을때 대문자로 
 * 대문자를 소문자로 변환하는 프로그램을 구현해라 
 * 
 * 문자입력 : A 
 * a 
 *
 * 문자입력 : a
 * A
 *
 * 
 * 
 * 
 * */

public class IfExam02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		char ch; //
		int n;
		
		ch = (char)System.in.read();
		
		/*
		System.out.print("문자 입력 : ");
		n = System.in.read();

		if (n >= 65 && n <= 90) {// 대문자 A
			n += 32; // 소문자 a - > 대문자로 
			ch = (char) (n); // 정수형을 문자로 강제 변환 // char 문자형 
			System.out.println(ch);
			
		} else if (n >= 97 && n <= 122) { // 소문자
			n -= 32;
			ch = (char) (n);
			System.out.println(ch);
		} else {
			System.out.println("입력오류");
		}
   */  
		// char 를 활용 
		System.out.print("문자 입력 : ");
		ch =(char)System.in.read();

		if (ch >= 'A' && ch <= 'Z') {
			ch += 32; 
			System.out.println(ch);
			
		} else if (ch >= 'a' && ch <= 'z') {
			ch -= 32;
			System.out.println(ch);
		} else {
			System.out.println("입력오류");
		}
		
		
		
		
		
		
	}

}













