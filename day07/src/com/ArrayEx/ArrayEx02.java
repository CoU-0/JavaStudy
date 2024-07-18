package com.ArrayEx;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[][] score = {

				{ 100, 100, 100 }, // 1행
				{ 20, 20, 20 }, 
				{ 30, 30, 30 }, 
				{ 40, 40, 40 } };
		int sum = 0;

		for (int i = 0; i < score.length; i++) { // 행 
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]\n", i, j, score);
				sum += score[i][j];
			}
		}
		System.out.print ("합계"+sum);

		/*
		for (int [] temp : score) { // score 각 인덱스를 temp에 저장
			for ( int i: temp) { // temp는 1차원 배열 
				sum += i;
			}
		}
		System.out.println("합계"+sum);
		*/
		
	}

}
