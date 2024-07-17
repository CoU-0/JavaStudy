package com.arrary;
import java.util.*;
public class ArraryEx02 {

	public static void main(String[] args) {
		// 배열 선언
		int[] arr; 
		Scanner sc = new Scanner(System.in);
		
		
		//메모리 공간을 할당한다 -> 배열의 크기할당 
		arr = new int[10];
		for (int i = 0; i < arr.length; i++) { // arr 만큼의 개수 만큼 반복 
		System.out.printf("%d값을 입력 : ",i+1);
		arr[i] =sc.nextInt();
		}
		
		// 배열의 선언과 동시에 초기화
		int[] arr1 = new int[10];  // 크기만 아는 상태임. 10개라는 
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10}; // 초기화 후 값을 넣음 
		int arr3[] = {1,2,3,4,5,6,7,8,9,10}; 
		int arr4[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0 ; i <arr.length; i++) { // 초깃값이 없으면 무조건 0 
			System.out.printf("%d\t", arr[i]);
		}
		System.out.println();
		for(int i = 0 ; i <arr1.length; i++) { // 초깃값이 없으면 무조건 0 
			System.out.printf("%d\t", arr1[i]);
		}
		System.out.println();
		for(int i = 0 ; i <arr2.length; i++) { // 초깃값이 없으면 무조건 0 
			System.out.printf("%d\t", arr2[i]);
		}
		System.out.println();
		for(int i = 0 ; i <arr3.length; i++) { // 초깃값이 없으면 무조건 0 
			System.out.printf("%d\t", arr3[i]);
		
		}
		System.out.println();
		for(int i = 0 ; i <arr4.length; i++) { // 초깃값이 없으면 무조건 0 
			System.out.printf("%d\t", arr4[i]);
		}
		System.out.println();
		for(int i = 0 ; i <=arr4.length; i++) { // 10개으 길이가 넘어갈 경우 - 범위를 벗어나 오류  // 정확히 공간의 할당이 없기 때문에 들어가수 없음
			System.out.printf("%d\t", arr4[i]);
		}
	
	}

}
