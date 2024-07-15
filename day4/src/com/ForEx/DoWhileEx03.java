package com.ForEx;

import java.util.Scanner;

/*
 * 사용자로부터 정수를 계속 입력받아 합계를 구하는 프로그램 
 * 단, 0을 입력하며 종료됨 
 *  do~ while 문을 이용하여 문제를 풀어라 
 *  
 * 
 * 
 * */


public class DoWhileEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=1, sum=0 ;		
		
			do {
			 System.out.println("정수 입력(0:종료)");
			n =sc.nextInt();
			
			sum +=n; 
		}while(n != 0);
			System.out.println(" 지금까지 누적된 수의 합은 : "+sum);
			
	}
}
