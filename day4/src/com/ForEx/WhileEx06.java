package com.ForEx;

/*
 * -50에서 1까지의 수를 출력하는 프로그램을 작성하시오.
 * 	단, 한 라인에 5개의 수만 출력하고, 수들 사이의 간격을 탭으로%t으로 조절하시오  // 구구단?
 * 
 *  -50 -49 -48 -47 -46 
 *  -45 -44 -43 -42 -41 
 *  
 *   0   1 
 * 
 */


public class WhileEx06 {

	public static void main(String[] args) {
     
		int a = -50 ;
		
		while ( a <=1) {
			System.out.printf("%d \t ",a);
			a++;
			if(-a%5==0)  // 5의 배수 단위로 줄바꿈 
				System.out.println();
			
		}
    	
      
	}

}
