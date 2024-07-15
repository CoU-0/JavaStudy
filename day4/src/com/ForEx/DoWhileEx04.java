package com.ForEx;

import java.util.*;

/*
두 개의 정수를 입력 받아 그 사이에 존재하는 정수들의 합계
* 구하는 프로그램을 구현하시오 
* ex) 
*  3 ,5 => 3+4+5 
*/



public class DoWhileEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, i, sum=0;
		
		System.out.print("첫번째 정수 :");
		n1 =sc.nextInt();
		System.out.print("두번째 정수 :");
		n2 =sc.nextInt();
	
		if (n1 >n2) { // n1 의 정수가 더 클때 
			n1 = n1^n2;
			n2 = n2^n1;
			n1 = n1^n2;	
		}
		
		i = n1;
		do {
				sum += i;
				i++;
		}while(n1 <=n2 );
			
			System.out.println("입력한 두 정수 사이의 합계 : " +sum);
		
		
	}

}
