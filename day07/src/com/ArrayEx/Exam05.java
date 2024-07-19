package com.ArrayEx;

import java.util.*;

/*
 * 
 * 문]
 * 정수를 10개 저장하는 배열을 생성하고 1에서 부터 10까지 범위의 정수를 랜덤으로 생성하라. 
 * 랜덤으로 생성하여 배열에 저장하고 저장된 배열값과 평균을 출력하시오.
 * 
 * 		int i = (int)(Math.random()*10+1)
 * 		1에서부터 10까지 범위의 정수를 랜덤으로 생성하는 코드 
 * 
 * 
 * */

public class Exam05 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		int num = 10;
		int sum =0;
		int[] arr = new int[num]; 

		Random rnd = new Random();
		
		for( int  i = 0; i <arr.length; i++ ) {
			arr[i] =(int)(Math.random()*10 + 1);
			sum += arr[i];
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		float avg = (float) sum/ arr.length;
		System.out.println(avg);
		
		
		
	}

}
