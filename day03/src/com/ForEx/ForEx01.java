package com.ForEx;

import java.io.*;


/*
 * 0에서 부터 입력한 정수의 합계의 프로그램 구현 하시오 ;. 
 * 
 * 
 * 
 * 
 * */





public class ForEx01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, sum = 0;
		
		
		System.out.println("정수를 입력하세요 : ");
		n = Integer.parseInt(br.readLine());
		
		
		
		
		for (int a =0 ;  a<=n ; a++ ) { // a =0 에서부터 n 까지  -- n은 내가 입력한 값까지의 더하기 
			sum +=a;
		}
		System.out.print("0부터 "+n+"까지의 합계 :"+sum );
		
		
		
	}

}
