package com.ArrayEx;
import java.util.*;
/*
 * 문
 *  컴퓨터와 사용자 사이의 가위 바위 보 게임 구현하시오. 
 *  
 *  사용자가 먼저 시작한다.
 *  사용자가 가위 바위 보 중 하나를 입력하고 엔터를 치면, 
 *  컴퓨터는 랜덤으로 하나를 선택하고 출력함
 *  사용자가 입력한 값과 컴퓨터가 랜덤으로 선택한 값을 비교하여 
 *  누가 이겼는지 판정하시오. 
 *  사용자가 가위 바위 보 대신 그만을 입력하면 모든 게임 종료 
 * 
 * 문자열 배열 생성 
 * String str[] = { "가위","바위","보"};
 * 
 * int n = (int)(Math.random()*3); n -> 0,1,2
 * 
 * 만약 컴퓨터가 낸것이 바위인지를 비교할 때 
 * 
 * if (str[n].equals("바위 :"))
 * */


public class Exam07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str[] = { "가위","바위","보"};
		
//		System.out.println(" 가위, 바위, 보를 입력하세요");
//		String user = sc.next();
		
		
		for (int i= 0; i<str.length; i++) {
			int j =(int)(Math.random()*3); // 0 1 2 
			
		}
		
		while(true) {
			System.out.print(" 가위, 바위, 보를 입력하세요");
			String user = sc.next();
			if(user.equals("그만")) 
				break;
			String com = str[(int)(Math.random()*3)];
		
			if (user.equals("가위")) {
				if (com.equals("가위")){
						System.out.println("비겼습니다.");
				}else if (com.equals("바위")) {
					System.out.println("사용자가 졌습니다.");
				}else {
					System.out.println("사용자가 이겼습니다.");
				}
			}
			if (user.equals("바위")) {
				if (com.equals("바위")){
						System.out.println("비겼습니다.");
				}else if (com.equals("보")) {
					System.out.println("사용자가 졌습니다.");
				}else {
					System.out.println("사용자가 이겼습니다.");
				}
			}
			if (user.equals("보")) {
				if (com.equals("보")){
						System.out.println("비겼습니다.");
				}else if (com.equals("가위")) {
					System.out.println("사용자가 졌습니다.");
				}else {
					System.out.println("사용자가 이겼습니다.");
				}
	
			}else {
				System.out.println("가위 바위 보가 아닙니다.");
			}
			
			
			
		}
		
		
		
		
		
		
	}

}
