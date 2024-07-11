package com02;

import java.io.*;
import java. util.*; 

/*
 * 임의의 정수를 입력받은 후 
 * 정수가 짝수인지 홀수 인지 판정하는 프로그램을 만드시오 
 * 
 * 
 */


public class IfEx03 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("점수 입력 :");
		
		int n = Integer.parseInt(br.readLine());
                  
					if(n% 2 == 0) {
					System.out.println(n+"은 짝수 입니다.");
					}else {
					
					System.out.println(n+"은 홀수 입니다. ");
					}

	}

}
