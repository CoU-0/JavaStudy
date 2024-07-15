package com.ForEx;

import java.util.*;

/*
 * 
 * 사용자로부터 하나의 숫자를 입력받아 그 수만큼 3의 배수를 출력하는
 * 프로그램을 구현하시오 
 * 
 * 만약 5가 입력되었다면 3 6 9 12 15  까지 의 배수가 입력 되어야함 
 * 
 * 
 * 
 * */



public class ForEx08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		// int ba = 1; --> 얘도 굳이
		
		System.out.println("숫자를 입력해 주세요 : ");
		n = sc.nextInt();
		
		for ( int i = 1 ; i<=n ; i++ )
		//ba = 3*i;    --> 굳이 
			System.out.print(3*i+" "); // 변수 그냥 바로 적용  \t -> 띄어쓰기 탭 
		
		
		
	}

}
