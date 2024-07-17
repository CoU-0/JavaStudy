package com.arrary;

import java.util.*;

/*
 *  문]
 *  	배열에 길이만큼  정수값을 입력받아 평균을 구하는 프로그램 7
 *  	단, 평균값은 실수로 출력하시오.
 */


public class ArraryExam03 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
		int arr[] = new int[7];
		int sum = 0; 
		double avg = 0; // 실수형 
		
		
		
		for (int i =0 ; i < arr.length; i++) {  // 7개	--> 
			System.out.print("배열의 길이만큼 정수값 : ");
			arr[i] =sc.nextInt();// 정수값에 입력받아 배열에 저장함 
		
		}
		for (int i =0 ; i < arr.length; i++) 
			sum += arr[i];
			avg= sum/arr.length;  // 배열의 길이만큼의 평균 = 배열의 길이 = 7로 나눔 
		 
			System.out.println("평균값은" + avg + "입니다.");
				
	}

}
