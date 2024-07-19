package com.ArrayEx;

/*
 * 문 ]
 * 다음과 같이 배열을 생성한 후, 배열을 풀력하면서 각행의 합계와 평균을 출력하는 프로그램을 구현하시오.
 * 
 * 78, 48, 78, 98 
 * 99, 92, 
 * 29, 64, 83
 * 34, 78, 92, 56 
 * 
 * 
 */

public class Exam08 {

	public static void main(String[] args) {

		int arr[][] = { 
				{ 78, 48, 78, 98 }, 
				{ 99, 92 }, 
				{ 29, 64, 83 }, 
				{ 34, 78, 92, 56 }
				};

		for (int i = 0; i < arr.length; i++) {
			
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				
				// [i][arr[i].length]];
				sum = sum + arr[i][j];
				
				System.out.print(arr[i][j] + " ");
			}
		
			
		
			System.out.printf("\t합 : %d, 평균 : %.2f\n", sum, (float)sum/arr[i].length);
		}

	}

}
