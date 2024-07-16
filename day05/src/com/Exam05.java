package com;


/*
 * for문의 반복 획수 변수가 배열의 인덱스일 경우 사용하는 반복문임 // 배열에서 
 *  반복 횟수 변수를 제어 해야할 경우에는 사용할 수 없음 
 * 
 */

public class Exam05 {

	
	public static void main(String[] args) {
		String [] arr = {"AA","BB","CC","DD","EE"}; // 인덱스 0번부터 

			for ( int i =0 ; i < arr.length; i++) { // length -> 
				System.out.println(arr[i]+"\t");
			}
		
		 System.out.println();
			
		 for (String s : arr) { // arr을 한번에 가져와서 한번에 출력 하는 방법 
			 System.out.println(s+"\t");
		 }
	}

}
