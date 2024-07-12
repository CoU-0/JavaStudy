package com.switchEx;

import java.io.*;


/*
 * 문 
 *  switch문을 이용하여 커피메뉴의 가격을 출력하는 프로그램을 구현하시오 
 *   커피종류 : 에스프레소, 카푸치노 , 카페라떼, 아메리카노
 *   가격 	   :  3500      3500     3500    1000
 * 
 * ex ) 
 * 
 *  무슨 커피를 드릴까요 ? 
 *  카페라떼는 3500원 입니다. 
 *  order / price 
 * 
 */



public class SwitchEx002 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String order;
		int price =0;
		
      
		System.out.print("무슨 커피를 드릴까요? : ");
		order = br.readLine();
		
		switch (order) {
		
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break ;
		
		case "아메리카노":
			price = 1500;
			break;
			default :
				System.out.println("그런거 없다");
				break;
		}
		if (price != 0) {
			System.out.println("당신 주문"+order+"커피"+price+"원이다.");
		}
		
	}

}
