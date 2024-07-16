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

public class WhileEx002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cnt=0; // 초기값이 필요한데 없는애들은 오류가 남 
		int sum =0;
		int n; // 입력된 정수의 개수 
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		while( n != -1) { // -1이 입력되면 while 벗어남 --> 이러면 if를 쓸 필요가 없음 
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
			sum += n;
			cnt++; // cnt를 증가시키고 정수를 입력받음   // 입력 된 값의 카운터 -> 몇번 세줬다. 
			//n = sc.nextInt(); // 입력 안하고 그냥 써도 입력은 가능 
		}
		if (cnt ==0) {
			System.out.println("입력된 정수가 없습니다.");
		}else {
			System.out.print("입력된 정수는"+cnt+"개이며");
			System.out.println("평균은"+(sum/cnt)+"입니다.");
		}
	
	}

}
