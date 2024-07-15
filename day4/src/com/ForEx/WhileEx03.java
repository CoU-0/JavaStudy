package com.ForEx;
import java.util.*;

/*
 * 		사용자가 입력하는 정수를 계속 더한다. 
 * 		단, 0이 입력되면 지금까지 입력된 정수의 합계를 구해라
 * 		while문을 이용 -if는? 
 * 
 * */


public class WhileEx03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n=1, sum=0 ;
	
	while(n != 0) { // true - > 무한으로 들어감 /  // 0이 종료되는 조건 
		System.out.println("정수 입력(0:종료)");
		n =sc.nextInt();
		
		sum +=n; // 입력된 것을 계속 누적 
	}
		System.out.println(" 지금까지 누적된 수의 합은 : "+sum);
		

	}

}
