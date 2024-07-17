package com.arrary;

/*
 *	문]
 *		임의의 숫자가 들어있는 배열의 숫자 데이터들 중 
 *		짝수 인 값만 골라서 출력하고, 3의 배수인 프로그램을 구현  
 *
 *		4 7 9 1 3 2 5 6 8 
 *
 *		배열의 전체 값 출력 
 *		짝수 값 출력 
 *		3의 배수 값 출력  
 */

public class ArrayExam01 {

	public static void main(String[] args) {

		int[] arr1 = {4, 7, 9, 1, 3, 2, 5, 6, 8};
		// 일반
		
		//배열의 길이 확인 
		System.out.println(arr1.length);
		
		System.out.println("배열에 저장된 전체 값 출력 ");
		for(int i =0; i<arr1.length; i++) {
			System.out.printf("%3d",arr1[i]);
		}
		
		
		System.out.println();
		System.out.println("배열에 저장된짝수 값 출력 ");
		for(int i =0; i <arr1.length; i++) {
			if (arr1[i] %2==0) // 인덱스 순서가 짝수인 겨우임.  
			System.out.printf("%3d",arr1[i]);
			
			}
		System.out.println();
		System.out.println("배열에 저장된짝수 값 출력 ");
		for(int i =0; i <arr1.length; i++) {
			if (arr1[i] %3==0) // 인덱스 순서가 짝수인 겨우임.  
			System.out.printf("%3d",arr1[i]);
			
			}
		
	}

}
