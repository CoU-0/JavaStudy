package com.ForEx;
import java.util.*;

/*
 * 1부터 입력받은 수까지의 전체의 합계, 짝수의 합계, 홀수의 합계를 각각 출력하는 프로그램을 구현하라 
 *  // 
 * 단 10단위로 입력하시오  //
 * 
 * 
 * Ex ) 
 * 
 * 출력형식 
 *  정수 :59 
 *  
 *  if 중첩문을 써서 3번 출력 될 수 있도록 
 *  1~ 10까지의 전체의 합계
 *  1~10 까지의 짝수의 합계
 *  1~10까지의 홀수의 합계 
 * 
 * 1~ 20까지의 전체의 합계
 *  1~20 까지의 짝수의 합계
 *  1~20까지의 홀수의 합계 
 * 
 * 1~ 30까지의 전체의 합계
 *  1~30 까지의 짝수의 합계
 *  1~30까지의 홀수의 합계 
 * 
 * 1~ 59까지의 전체의 합계
 *  1~59 까지의 짝수의 합계
 *  1~59까지의 홀수의 합계 
 * 
 * 1. 전체 합계 구하기
 * 2. 짝수 홀수 나누기 
 * 3. 10단위 어떻게 자를것인지 고민 
 * 
 * */



public class ForEx06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n; // 입력받을 정수 
		int sum, odd, even;  //초기화가 안되기 때문에 0값 입력 // 일일이 해줘야함 // 
			sum=odd=even=0;
		
		System.out.print("값을 입력해 주세요");
		n= sc.nextInt();
		
		for (int i=1; i <=n ; i++) {
			
			if (i %2==0)
				even +=i; // 짝수의 합
			else
				odd+=i;// 홀수의 합 
			
			sum += i; // 전체의 합 
			
			if( i== n ) {
				System.out.println("1~"+i+"까지 전체의 합계:" +sum);
				System.out.println("1~"+i+"까지 홀수의 합계:" +odd);
				System.out.println("1~"+i+"까지 짝수의 합계:" +even);
				
			}else if (i % 10 == 0 ) {
				System.out.println("1~"+i+"까지 전체의 합계:" +sum);
				System.out.println("1~"+i+"까지 홀수의 합계:" +odd);
				System.out.println("1~"+i+"까지 짝수의 합계:" +even);
				}
				}
		
		
		
		
		
		
		
	}
}
