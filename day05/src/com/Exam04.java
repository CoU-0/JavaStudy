package com;


/*
 * 		break label 
 * 		 -  break 문과는 달리 여러개의 반복문을 빠져나 나갈때 사용함 
 * 
 * 
 * 		형식
 * 		레이블명 :
 * 		for(){
 * 			for(){
 *
 *			break 레이블명 : 레이블명이 있는 곳까지 한번에 빠져나옴 
 *		}
 *	}
 */



public class Exam04 {

	public static void main(String[] args) { // 레이블 이름 설정 
	 
		One : for (int i =0; i <5; i++ ) {
			Two : for (int j = 0; j<3 ; j++) {
				if (j ==2) 
					//break One;  // j 가 2가 되면 원만 
					continue One;
					System.out.println(j+"x"+i+" ");
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
