package com.ForEx;
import java.util.*;

/*
 * 문]
 * 정수를 입력받아 짝수이면 다시 입력받고, 홀수이면 프로그램을 종료합니다. 
 * 
 * 
 * 
 * 
 * 
 * 
 * */



public class WhileEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n ;
		
/*		
		while(true) {
			System.out.println("정수를 입력해 주세요 :");  // 계속 입력을 받아야함  - > 
			n = sc.nextInt();
			 	if(n %2 != 0) {
			 		break;
			 	}
		      	
		}
*/			
			System.out.println("나느 자바를 좋아한다.");
			
			System.out.print("계속 진행하시겠습니까? : y/n");
			char ch = sc.next().charAt(0);
					
		if (ch == 'N' || ch=='n') {
			break;
		}
			 
	}

}
