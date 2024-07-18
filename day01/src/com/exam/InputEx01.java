package com.exam;

import java.io.*;
/*
 * 아스키 코드값 입력 받기 
 * 기본적으로 알아야할 값 
 * 0~9 ( 아스키 코드로 48 ~ 57)
 * A~Z ( 아스키 코드로 65 ~ 90) 소문자에서 +32 하면 대문자 
 * a~z ( 아스키 코드로 97 ~ 122)
 * 
 * 
 * 
 */





public class InputEx01 {

	public static void main(String[] args) throws IOException { // 아스키 코드는 버퍼 스캐너 같은 객체 안만들어됨 
		
		System.out.print("문자입력 :");
		int i =System.in.read();
		//System.in.read();
		//System.in.read();
		
		System.out.print("문자입력 :");
		int j =System.in.read();
		
		System.out.println("ASCII code "+i);
		System.out.println("ASCII code "+j);
		
     
	}

}
