package com.ForEx;

import java.util.*;

/*
 * 이 자판기에는 콜라, 사이다, 마운듀, 에이스, 웨하스에 나오는 
 * 자판기 프로그램을 구현하시오. 
 * 
 * 단! 0이 입력되면 종료 하시오. 
 * 1콜라 2 사이다 3 마운틴 4 에이스 5 웨하스 6 0: 종료
 * 
 * while -쓰라는것은? 
 *  범위를 설정 해서 - > 1 ~ 6까지의 숫자를 계속 입력 / 그러다가 0이 나오면 종료  
 * 
 * 
 * */


public class WhileEx07 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	 
	int n = 1 ;
	String str = "";
	
	while (n != 0) { // 무한 반복이니까 질문 자체를 안에다가 넣음 
		System.out.println("1. 콜라 2. 사이다 3. 마운틴 4. 초코송이 5. 에이스 6. 웨하스 (0 : 종료)");
		n = sc.nextInt();
	
		switch(n) {
		case 0:
			
			System.exit(0);
		case 1:
			str ="콜라";
			break;
		case 2:
			str ="사이다";
			break;
		case 3:
			str ="마운틴";
			break;
		case 4:
			str ="초코송이";
			break;
		case 5:
			str ="에이스";
			break;
		case 6:
			str ="웨하스";
			break;
			default:
				str="선택하신 상품이 없습니다.";
		
		}
		System.out.println(str);
		
	}
	
	
	
	/*
	System.out.println("숫자를 입력해 주세요");

	
	while (true ) {
		
	
		switch(n) {
		case '1' :
			System.out.println("콜라");
			break;
		case '2' :
			System.out.println("사이다");
			break;
		case '3' :
			System.out.println("마운틴");
			break;
		case '4' :
			System.out.println("초코송이");
			break;
		case '5' :
			System.out.println("에이스");
			break;
		case '6' :
			System.out.println("웨하스");
			break;
		default :
			System.out.println("종료");
			break;
		
		}
		
		
	}
	*/


	}

}
