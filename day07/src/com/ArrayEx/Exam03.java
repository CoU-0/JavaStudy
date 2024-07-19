package com.ArrayEx;
import java.util.*;
/*
 * 문
 * 알파벳 소문자 하나를 입력받고 다음과 같이 출력하는 
 * 프로그램을 구현하시오 
 * abcde 
 * abcd
 * abc
 * ab
 * a
 * 
 * 
 * */



public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("알파벳 입력 : ");
		String s = sc.next();
		char c = s.charAt(0); // 0번째 
		
		//
		if (c <'a' || c>'z') {
			System.out.println("소문자가 아닙니다.");
			return;
		}
		
		
		
		for(char i = c ; i>='a' ; i--) {
			for (char j = 'a'; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		

	}

}
