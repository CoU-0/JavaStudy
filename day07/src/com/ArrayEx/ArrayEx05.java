package com.ArrayEx;

/*
 *		1 2 3 4 5
 * 		23456
 * 		34567
 * 		45678
 * 		56789
 * 
 * */



public class ArrayEx05 {

	public static void main(String[] args) {
		

		// 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];

		//
		int n = 1; // 메모리에 저장될 값 0,0
		// 값을 배열에 저장
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i+1 +j ;
				System.out.printf("[%d] ",i+j);
				//n ++;
			}
			System.out.println();

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d\t", arr[i][j]);
			}
			System.out.println();
		}

	}

}
