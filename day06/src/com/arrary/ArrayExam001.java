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

public class ArrayExam001 {

	public static void main(String[] args) {

		int[] arr;
		int[] arr1 = {4, 7, 9, 1, 3, 2, 5, 6, 8};
		int i;
		
		for (i = 0; i %2 == 0 ; i++) {
			System.out.printf("%d\n",arr1[i]);
		}
		
		for (i = 0; i %3 == 0; i++) {
			System.out.printf("%d\n",arr1[i]);
		}

	}

}
