package com.ForEx;

import java.io.*;



/*
 * 문]
 * 양의 실수만 입력받아 입력받은 합의 평균을 구하는 프로그램을 구현하시오 
 * 단, 음의 실수를 입력하면 계산하시오  /
 * 
 * 1.1
 * 2.2
 * 3.3
 * -5.5
 * 평균 : 
 * 
 * float - 
 * 
 * 
 * 
 * 
 * 
 * */

public class ForRx002 {

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		float n=0.0f  , sum=0.0f ;
		// sum = n = 0.0f;
		int cnt =0;
		
		for (; n >=0.0;) { // 실수 형태이기 때문에 실수 형태를 맞춰줘야함 
			sum += n;
			System.out.print("양의 실수 입력 : ");
	         n =  Float.parseFloat(br.readLine());
	         cnt ++;
		
		}
		
		System.out.println("지금까지의 평균 : "+(sum / cnt));
		
		
		
	}

}
