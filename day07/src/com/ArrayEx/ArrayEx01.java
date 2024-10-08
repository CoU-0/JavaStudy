package com.ArrayEx;

/*
 * 다차원 배열 
 * 	선언 : 자료형 [][] 배열명; 또는 자료형 배열명[][]; 또는 int[] 배열명[]
 * 
 * 초기화 
 * 		1. 배열 = new 자료형 [행][열]; (정형배열)
 * 		2. 배열명 자료형[행][]; 가변배열(래기드 배열 , 비정형배열)  // 열은 그때마다 배열  
 * 		3. 배열명 = {{1,2,},{3,4},{5,6}} -> 배열값에 의해서 행과 열 123- 행 45행 67행
 * 							[3][2]
 * 
 * 
 * */

public class ArrayEx01 {

	public static void main(String[] args) {

		int[][] arr1; //다차원 배열 선언 
		//int []arr[];  -> 같은 의미 
		int arr2[][]; 
		int arr3 [][];
		
		// 메모리 할당 초기화  : 데이터가 저장될 공간 - 크기를 구해서잡음 
		arr1 = new int [2][3];
		arr2 = new int [2][]; // 자바의 배열은 1차원만 관리함.
		
		//배열의 값 저장 
		
		// 첫번째 행 시작 
		arr1[0][0] =100; // 인덱스 값 행은 안바뀌고 열이 바뀜 
		arr1[0][1] =200; // 인덱스 값
		arr1[0][2] =300; // 인덱스 값
		// 첫번째 행 끝		
		
		// 두번째 행 시작
		arr1[1][0] =400; // 인덱스 값 행은 안바뀌고 열이 바뀜 
		arr1[1][1] =500; // 인덱스 값
		arr1[1][2] =600; // 인덱스
		// 두번째 행 끝 
		
		for (int i =0 ; i <arr1.length; i++) {// 행을 의미  // 
			arr1[i] = new int[6]; // --> 열을 늘리려고? 
			
			
			
			
			for(int j = 0; j <arr1[i].length; j++) { // 열  -> 행을 가지고 들어가야 열을 출력할 수 있음 
				System.out.print("arr1["+i+"]["+j+"]:"+arr1[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}

}
