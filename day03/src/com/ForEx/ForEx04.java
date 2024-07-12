package com.ForEx;


import java.io.*;
/*
 * 두 개의 정수를 입력 받아 그 사이에 존재하는 정수들의 합계
 * 구하는 프로그램을 구현하시오 
 * ex) 
 *  3 ,5 => 3+4+5 
 * 
 * 
 * */





public class ForEx04 {

	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	int a, b =0;
	int i, sum=0 ;
	
	
	System.out.println("첫번째 수 : ");
	a = Integer.parseInt(br.readLine());
			
	System.out.println("두번째 수 : ");
	b = Integer.parseInt(br.readLine());
	
	if (a>b ) { // 순서대로먄 되는데 첫번째 수보다2번째 수가 더 큼 // 
		a = a^b;
		b = b^a;
		a = a^b;
	}
	for (i =a ; i<=b; i++)	{
		sum +=i;  //ex~ 3 넣으면 4 되고 5가 됨 
	}
	System.out.println("두 수 사이의 합계 : " +sum);
	
	
	}

}
