package com.ForEx;

import java.util.*;

/*
 * 사용자로부터 원하는 구구단을 입력받아 해당하는 구구단을 출력하는 
 * 프로그램을 구하시오 
 * 
 * 단 1~ 9단 사이의 수를 입력받는 상황이 아니라면 프로그램을 종료하시오.
 * 
 * 
 * 출력 
 * 단 입력 : 11 
 * 1~ 9까지의 정수만 입력 가능합니다. 
 * 
 * 
 * */





public class ForEx007 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n; // 입력받을 정수 
		
		
		
		System.out.print(" 단 수를 입력 해주세요 : ");
		n = sc.nextInt();
		
		for (int i =2; i <= 9; i++) {
			
			
			if (n > 9 ) {
				System.out.println(" 1 ~ 9까지의 정수만 입력해 주세요 ");
			
			}
			
			
		}
			
	
		
	}

}
