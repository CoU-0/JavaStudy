package com02;

import java.util.*;
/*
 * 연도를 입력받아서 윤년인지 평년인지 판정하는 프로그램을 구해라
 * 
 * 윤년조건 
 * 4로 나누어 떨어지고 
 * 4로 나누어 떨어지고,100으로 나누어 떨어지면 (평년) 
 * 400으로 나누어 떨어지면 윤념임 
 * 
 * 
 * 
 * */



public class IfEx13 {

	public static void main(String[] args)  {
		
		Scanner sc= new Scanner(System.in);
		int cal;
		System.out.println("연도를 입력하세요 : ");
		cal = sc.nextInt();
		
		if ((cal %4 ==0 ) && (cal %100 !=0 )||(cal % 400 ==0)){
			System.out.println("당신이 입력하신"+cal+"는 윤년입니다.");
		}else {
			System.out.println("당신이 입력하신"+cal+"는 평년입니다.");
		}
		
		
	}

}
