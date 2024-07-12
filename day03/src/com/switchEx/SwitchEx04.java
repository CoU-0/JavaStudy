package com.switchEx;

import java.util.*;
/*
 * 
 * 00년대 이후에는 3 4 니까 인덱스부터 8번째 짜리 
 * 
 * 
 * */




public class SwitchEx04 {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in );
		
		System.out.println("주문번호 입력 : "); // 123456 - 1234567 --> String 
		
		//char jumin = sc.next().charAt(7); // 문자 하나만 입력 받을 방법 - 
		String jumin = sc.nextLine();
		char ju =jumin.charAt(7); // 해석 
		
		switch (ju) {
		case '1':
		case '3':
			System.out.println("당신의 성별은 남자입니다.");
			break;

		case '2': // 문자라서 싱클쿼터 붙음 
		case '4':
			System.out.println("당신의 성별은 여자입니다.");
			break;
	
		default:
			System.out.println("사람이 아닙니다. 다시 입력해주세요.");
			break;
	
	
		}
		
		
		
	}

}
