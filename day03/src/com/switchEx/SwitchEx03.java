package com.switchEx;

import java.io.*;
/*
 * 
 * 
 * 월을 입력해서 계절찾아라 
 * 
 * 
 * 
 * */

public class SwitchEx03 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int month;
		
		System.out.println("월 입력 : ");
		month =Integer.parseInt(br.readLine());
		
		if (month >=1 && month <=12) {
			
		
		if (month  == 3 || month == 4 || month == 5)
		{
		System.out.println("현재 계절은 봄입니다.");
		
		}else if (month  == 6 || month == 7 || month == 8){
		System.out.println("현재 계절은 여름입니다.");
		
		}else if (month  == 9 || month == 10 || month == 11){
		System.out.println("현재 계절은 가을입니다.");
		
		}else{
			System.out.println("현재 계절은 겨울입니다.");
			}
		}
		
		/*
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;	
			
		case 9:
		case 10:
		case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;	
			
		default :
			System.out.println("현재의 계절은 겨울입니다.");
			break; // 생략 가능 // 나머지 지정 - default - 설정을 계절이 아닙니다. 
		*/
		

		
		}

}
