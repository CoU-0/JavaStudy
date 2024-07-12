package com.ForEx;

/*
 * 
 * 무한대로 두 개의 정수를 입력받아서 합을 구하는 프로그램을 구현 
 * 
 * 
 * 
 * */

import java.util.*;



public class ForEx003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		for (   ;   ;   ) {
			System.out.print("첫번째 정수 :");
			n1 =sc.nextInt();
			if (n1==0)
				break;
			System.out.print("두번째 정수 :");
			n2 =sc.nextInt();
			System.out.println("두 수의 합계 는 : "+(n1 +n2)+"입니다.");
			
		}
		
		
		
}

}
