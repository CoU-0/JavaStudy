package com.ArrayEx;

/*
 * 		1 	2 	3 	4 	5
 * 		6 	7 	8 	9 	10
 * 		111213 14 15
 * 		--- 			25
 * */

public class ArrayEx04 {

	public static void main(String[] args) {

		// 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];

		//
		int n = 1; // 메모리에 저장될 값 0,0
		// 값을 배열에 저장
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n;
				n++;
			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d\t", arr[i][j]);
			}
			System.out.println();
		}

	}

}
