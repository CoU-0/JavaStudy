package com.ForEx;
import java.util.*;

/*문 ]
 * 3의 승수를 입력하여 출력하는 프로그램을 구현하시오.
 * 
 *3의 5승은 243 입니다. 
 * 
 * 
 * */




public class ForEx009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n ; // 입력값 
		int sum = 0;
		
		System.out.println("승수를 입력하세요 : ");
		n = sc.nextInt();
		
		
		for (int i = 1 ; i <=n; i++ ) {
			sum += n*n;
			     
			System.out.printf("3의 %d승은 %d입니다.", n, sum*3);		
					
		}

		
		
	
	
	
	
	
		
		
	}

}
