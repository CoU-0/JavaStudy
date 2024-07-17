package com.arrary;

import java.util.*;

// 양의 정수 5개를 입력받아 배열에 저장하고 제일 큰 수를 출력하는 프로그램을 구혀하시오 


public class ArrayExam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int n; 
		int arr []= new int [5];
		int max =0; // 최대값을 저장할 변수 
		
		
	
		for ( int i =0 ; i <5 ; i++) {	               
			System.out.println("양의 정수 입력 : ");
			arr[i]= sc.nextInt(); // 입력받은 정수를 배열에 저장 
			// max에 저장된 값보다 max  값을 나중에 들어온 값으로 변경 
			
			if (arr[i]>max) {// max값보다 배열에 저장된 값이 크면 
				max = arr[i]; //  max 값을 변경합니다.
			}
		}
		System.out.println("가장 큰 수는"+max +"입니다.");
		
		
		
			
		 
			
		}
			
		
		
		}
		

	


