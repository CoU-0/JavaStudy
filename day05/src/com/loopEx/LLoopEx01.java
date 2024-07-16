package com.loopEx;
import java.io.*;
/*
 *	문1
 *		문자 하나를 입력받아 대문자인지 소문자인지를 판별하는 프로그램을 구현하시오 		
 *	출력
 * 		문자입력 : a
 * 
 * 		a는 소문자 입니다. 
 * 
 * 
 * 		65
 * 
 * 
 * */


public class LLoopEx01 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     char ch =0;
     
     System.out.println("알파벳을 입력하시오 : ");
     ch = (char)System.in.read();
     
     if (ch >=65 && ch <=90 || ch >=97 && ch <=122 ) {
    	 System.out.print(ch +"는");
    	 	if ( ch >= 65 && ch <=90) {
    	 		System.out.print("대");
    	 	}else {
    			System.out.print("소");
    	 	}
    	 	System.out.println("문자입니다");
     }else {
    	 System.out.println("영문 대소문자가 아닙니다.");
     }
     
     
     
     
     
     
     
     
     
//    (a = 97; a<=122; a++) {
//    	 System.out.print(n);
//    	 
//     }
//     if ( a <)
//    	 
//		
		
	}

}
