package com.ArrayEx;

/*
 *  문]  
 * 		2차원 배열에 학년별로 1학기와 2학기 성적을 저장하고, 4년간 전체 평점에 대한 
 * 		평균을 출력하는 프로그램을 구현하시오. 
 * 		1  	 	3.3 /3.4
 * 		2 		3.5 /3.6
 *		3 		3.7 / 4.0 
 * 		4		4.1 / 4.2
 *
 *		학점에대한 평점 
 *
 *
 */


public class ArrayEx007 {

	public static void main(String[] args) {
		
		double arr [][] = {
				{3.3, 3.4},
				{3.5, 3.6},
				{3.7, 4.0},
				{4.1, 4.2}
		};
		int one = 0;
		int two = 0;
		
		for ( int i =0 ; i <arr.length; i++) {
			int sum = 0; float avg =0.f;
			
			one += arr[i][0];
			two += arr[i][1];
			
		}
		
	 
		
		
		
		
	}

}
