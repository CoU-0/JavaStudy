package com.ForEx;

import java.util.*;
/*
 * 팩토리얼을 계산하는 프로그램을 구현하시오 
 * 
 * 사용자로부터  n이라는 수를 입력받아
 * n까지의 팩토리얼을 구하면 됨 
 * 
 * n! = 1 2 3 4 5 6 p----
 * 
 * 
 * 출력결과 7의 팩토리얼은 5040 입니다. 
 * 
 * */



public class ForEx05 {

	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
       
	 int n =1;
	 int sum=1;  // 이 초기값이 0이 되면 안됨 
	 
	 System.out.println("수를 입력하세요 :");
	 n =sc.nextInt();
     
	 for (int i=1; i<=n; i++) {
		  
		 sum*=i;
	 }
	 System.out.println(n+"의 팩토리얼은"+sum+"입니다.");
	 
	 

		
		

	}

}
