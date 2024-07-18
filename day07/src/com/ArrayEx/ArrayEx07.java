package com.ArrayEx;

import javax.net.ssl.SSLEngine;

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


public class ArrayEx07 {

	public static void main(String[] args) {
		
		double arr [][] = {
				{3.3, 3.4},
				{3.5, 3.6},
				{3.7, 4.0},
				{4.1, 4.2}
		};
		
		double sum = 0;
		float avg =0.f;
		
		for ( int i =0 ; i <arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
			sum += arr[i][j];
			}		
		}
		
		//행 
		int n = arr.length;
		int m = arr[0].length;
		
		System.out.println("4년 전체 평균 평점 : "+sum /(n*m));
		
		
		
		
	}

}
