package com02;

import java.io.IOException;
import java.util.*;


public class IfEx003 { // 03 스캔으로 했을 경우  

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
      
		System.out.print("점수 입력 :");
		int n = sc.nextInt();
		
		
		if(n% 2 == 0) 
			System.out.println(n+"은 짝수 입니다.");
		else 
			System.out.println(n+"은 홀수 입니다. ");
			
			
		
		

	}

}
