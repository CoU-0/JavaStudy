package com;

/*
 * 	문]
 * 		for문을 이용하여 1에서 10까지 덧셈으로 표시하고 합계를 출력하는 
 * 		프로그램을 구현하시오.
 * 		
 * 		출력 
 * 		1+2 + ...+10 = 55
 * 
 */

public class LoopEx001 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		
		for (int i = 1; i <=10; i++) {
			sum += i;
			System.out.print(i);
			
			if (i == 10) {
				System.out.println("="+sum);
				
			}else if(i <=9) {
				System.out.print("+");
			}
		 
		}
		
		
		
	}

}
