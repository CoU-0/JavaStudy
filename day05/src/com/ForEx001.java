package com;

/*
 * 다중(중첩) for문 
 * 
 *  for문 안에 for문이 존재하는 경우 
 * 
 * for (초기값 ; 조건식 ; 증감식){ // 행 
 * 		for (초기값 ; 조건식 ; 증감식 {// 열 
 * 			 수행문 
 *    }
 * 		system.out.println();
 * }
 * 
 * 
 * */


public class ForEx001 {

	public static void main(String[] args) {

		int i, j, k;
	
		for( i = 1; i<=6; i++) {
			for (j = 1; j<=6-i; j++) {
				System.out.print("*");
		}
			System.out.println();


		for (j = 1; j<=6-i; j++) {
			System.out.print(" ");
	}
		System.out.println();
	
		}
	
	}
}

