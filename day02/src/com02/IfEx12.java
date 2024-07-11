package com02;

import java.io.*;

/* 문]
 * 
 * 임의의 알파벳 한 문자를 입력받아
 * 입력받은 알파벳이 모임일 경우를 출력하는 프로그램을 구현하시오 
 * 그외는 자음으로 출력하는 프로그램을 구현하시오. 
 * 
 * 단, 알파벳의 범위는 대소문자의 범위임
 * 알파벳이 아닌경우 입력오류라고 출력 하시오.
 * 알파벳이 아닌경우 "입력오류"라고 출력하시오.
 * 
 */

public class IfEx12 {

	public static void main(String[] args) throws IOException {
	 
		char ch;
		System.out.println("입력 문자 : ");
		ch =(char)System.in.read();
		
		if ((ch >='a' && ch<='z')||(ch>='A' && ch <='Z'));{
			//System.out.println("알파벳 맞습니다.");
				if ((ch =='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u')&&
						(ch =='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U')) {
					System.out.println("모음입니다.");
				
				}else  {
			System.out.println("자음입니다.");
		}
		
		
		

	}

}
}