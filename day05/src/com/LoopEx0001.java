package com;
import java.util.*;

/*
 * 	문]
 * 		for문을 이용하여 1에서 10까지 덧셈으로 표시하고 합계를 출력하는 
 * 		프로그램을 구현하시오.
 * 		
 * 		출력 
 * 		1+2 + ...+10 = 55
 * 
 */

public class LoopEx0001 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		
		int sum = 0;
		int n =0;
		
		System.out.println("정수 입력 : ");
		n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			sum += i;
			System.out.print(i);
			
			if (i == n) {
				System.out.println("=");
				
			}else if(i <=n) {
				System.out.print("+");
			}
		 
		}System.out.println(sum);
		
		
		
	}

}
