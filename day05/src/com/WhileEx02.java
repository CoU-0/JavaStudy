package com;

import java.util.*;

/*
 * 문]
 * 		while 문을 활용하여 -1이 입력될때까지 정수를 계속 입력받아  -- > if -> -1만이 멈출 수 있다. 
 *      합계를 구하고 평균을 구하는 프로그램을 작성하시오 
 * 
 * 
 * 
 */

public class WhileEx02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;
		int sum = 0;
		float avg = 0.f;

		/*
		 * for (int i = 0 ; i <=n ; i++ ) { sum += i; System.out.println(sum);
		 * System.out.println("정수를 입력해 주세요 "); }
		 */

		int i = 0;
		while (true) {

			System.out.print("정수를 입력해 주세요(단 , -1 일경우 종료됩니다.) :");
			n = sc.nextInt();

			if (n == -1) {
				break; //
			}
			sum += n;
			i++; // 이게 어려움..
		}
		System.out.println(sum);
		avg = sum / i;
		System.out.printf("%.2f", avg);
	}

}
