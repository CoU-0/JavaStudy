package com;


/*
 * 	1. 변수 
 * 		-하나의 데이터를 저장할 수 있는 공간 
 * 	2. 배열 
 * 		- 같은 종류의 여러 데이터를 하나의 집합으로 저장할 수 있는 공간
 * 	3. 구조체 
 * 		- 서로 관련된 여러 데이터를 종류에 관계없이 하나의 집합으로 저장할 수있는 공간 
 * 	4. 클래스 
 * 		- 데이터와 함수의 결합 (구조체 +함수)
 * 
 *
 * 
 * 
 */


public class TvExam01 {

	public static void main(String[] args) {
		TV [] tvArr = new TV[3]; // 배열선언 
		// 길이가 3인 Tv객체배열 
		
		// Tv라는 객체를 생성해서 Tv객체 배열의 각 요소에 저장한다. 
		for (int i =0; i <tvArr.length; i++) {
			// Tv객체 생성 
			tvArr[i] = new TV();
			tvArr[i].channel = i+10; // 10 11 12 
			//tvArr[i]의 channel에 i +10을 저장 - 들어갈 때마다 / 축적x 
			System.out.printf("tvArry[%d].channel =%d%n", i, tvArr[i].channel);
	
		
		}
		for (int i = 0; i<tvArr.length; i++) {
			tvArr[i].channelUP();
			System.out.printf("tvArry[%d].channel =%d%n ", i, tvArr[i].channel);
			
			
		}
		
		
		
		
		
		
		
	}

}
