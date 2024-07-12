package com.ForEx;

/*
 * 
 * for문은
 *  - 특정한 명령들의 정해진 규칙에 따라 반복 처리할 때 사용하는 제어문.
 *  
 *  형식
 *    for( 초기값 ; 조건식 ; 증감식){
 *    		반복수행되는 문장들; 
 *    }
 * 
 *  초기값 : 가장 먼저 한번만 수행함 
 *  조건식 : 초기값 다음으로 수행되는 식이며 반복할 때 마다 
 *  		  한번씩 비교하여 반복을 수행할 것인지 아니면 멈출것인지 벗어날 것인지 결정
 *  증감식 : 반복 수행할 때마다 조건식의 비교하기 전에 항상 수행되며 
 *  		  변수값을 증가 또는 감소 시켜서 반복을 수행한다. 
 * 
 * 
 * */
//1부터 5까지 세로로 한번씩 가로로 한번씩 출력하는 프로그램을 구현.



public class ForEx01java {

	public static void main(String[] args) {
	
		
		for (int i = 1 ; i<=5 ; i++) {// 세로먼저 찍음 
			System.out.println(i);
		}
		System.out.println();
		for (int i = 1 ; i <=5 ; i++) {// 가로찍기 
			System.out.print(i+"\t");
		}
		
		System.out.println();
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum +=i;
		}
		System.out.println("1~10까지의 합계 : "+ sum);
		
		System.out.println();
		System.out.println();
		
		for ( int i = 1, j =10; i <=10; i++, j--) {
				System.out.printf("%d\t %d\n", i , j);
			
		}
			
		 
		 
		 
		 
			
			
	}

}
