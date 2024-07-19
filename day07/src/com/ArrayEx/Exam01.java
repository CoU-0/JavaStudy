package com.ArrayEx;

/* 문 ]
 * 이차원 배열 n을 출력하는 프로그램을 만들어라 
 *  
 *  int n[][] = {
 *  				{1},
 *  				{1, 2, 3}
 *  				{1}
 *  				{1,2,3,4}
 *  				{1,2}
 *  }
 * 		출력
 * 1
 * 1 2 3
 * 1
 * 1 2 3 4
 * 1 2 
 * 
 * 
 * 
 * */

public class Exam01 {

	public static void main(String[] args) {
		
		int n[][]= {{1},{1, 2, 3},{1},{1,2,3,4},{1,2}};
		
		for (int i = 0; i < n.length; i++) {
			for(int j = 0; j <n[i].length; j++) {
				
				System.out.printf("%3d",n[i][j]);	
			} System.out.println();
		
		}
	}

}
