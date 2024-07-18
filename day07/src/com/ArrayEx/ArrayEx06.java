package com.ArrayEx;

/*
 * 	문 ] 
 * 		사용자로부터 입력받은 변수의 새구만큼 
 * 		임의의 수(난수)를 발생시켜 배열에 저장하고 
 * 		저장된 데이터 중 가장 큰 값과 가장 작은 값을 출력하는 
 * 		프로그램을 구현한다. 
 * 
 * 		난수의 개수 : 3
 * 		53  46  92 --> 랜덤 발생?
 * 
 * 		가장 큰 값은 92, 가장 작은 값 46
 * 
 * 
 * */

import java.util.*;
// Random 과 scanner /
public class ArrayEx06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("난수의 개수 입력 : ");
		int num = sc.nextInt();
		
		//num 변수에 저장된 개수만큼 메모리를 할당 
		int[] arr = new int[num]; // num만큼 공간 확보 
		
		//난수 (1~100)를 발생시키고 배율에 저장 
		Random rnd = new Random();
		
		for (int i = 0; i <arr.length; i++) {
			arr[i] = rnd.nextInt(100)+1; // 정수형태로 +1  
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		// 최대값 최소값을 구함 
		int max ,min ;
		max =min = arr[0]; //인덱스 첫값이 무조건 최대값  
		
		for (int i = 0 ;i <arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
			if(arr[i] < min)
				min =arr[i];
		}
		System.out.println("가장 큰 값 : "+max + ", 가장 작은 값 : "+min);
		
		
		
		/*	로또 
	 * for (int j =0 ; j<5;j++){ // 10 
		for (int i = 0; i <arr.length; i++) {
		arr[i] = rnd.nextInt(45)+1; // 정수형태로 +1  
		System.out.print(arr[i]+"\t");
	}
	sysout
	}
	*/
		
		
		
		
		
	}

}
