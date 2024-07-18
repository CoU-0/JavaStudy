package com.ArrayEx;

/*
 * 		비정형 배열
 * 		
 * 		행마다 열의 개수가 새로 다른 배열을 의미함 
 * 		
 * 		int [][] arr = new int [4][];
 * 
 * 		arr[0] = new int [4]; 첫번째 행에 열의 개수는 4개다 
 * 		arr[1] = new int [2]; 두번째 행에 열의 개수는 2개다 
 * 		arr[2] = new int [3]; 세번째 행에 열의 개수는 3개다 
 * 		arr[3] = new int [1]; 네번째 행에 열의 개수는 1개다 
 * 
 * 		10		11		12
 * 		20		21		
 * 		30		31 	32 
 * 		40		41		
 * 
 * 
 * 
 * */



public class ArrayEx08 {

	public static void main(String[] args) {
		
		int arr[][] = new int [4][]; // 행 4개인데 열은 아직 
		arr [0] = new int[3];
		arr [1] = new int[2];
		arr [2] = new int[3];
		arr [3] = new int[2];  // 들어갈 메모리 확보함 .
		
		
		// 배열에 데이터 저장 
		for (int i =0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				arr[i][j] = (i+1)*10+j; // 10단위로 출력하기 위해서
				System.out.printf("%3d\t", arr[i][j]);
			}
			System.out.println();
		}
		
		
		
		// 배열에 저장된 데이터 출력 
		
	}

}
