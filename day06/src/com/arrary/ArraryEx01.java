package com.arrary;

/*
 * 		-같은 자료혈끼리 모아주는 하나의 묶음
 * 		- 자바에서 하나의 배열은 하나의 객체로 인식한다
 *		- 동일한 자료형이 여러개 반복될떄 이를 하나의 변수명으로 관리하며 
 *		  각각의 구분은 순차적인 첨자(index=인덱스)를 사용함 
 * 		
 * 		참조 자료형 : 4byte
 * 		
 * 		1차원 배열 
 * 			선언방법 : int[] 배열명; 또는 int 배열명[];'
 * 			배열 초기화  : 배열명 = new 자료형 [개수];
 * 							배열명 ={v1, v2, v3};
 * 			new 연산자에 의해서 할당되면 값은 자동으로 초기화됨 
 * 			int a[] = new int[3]
 *			a[0]=0;
 *			a[1]=0; 
 * 			a[2]=0;
 * */




public class ArraryEx01 {

	public static void main(String[] args) {

		char [] ch; // 배열 선언 
		ch = new char[4] ; // 배열의 초기화 
		ch[0]='j';
		ch[1]='a';
		ch[2]='b';
		ch[3]='a';
		
		System.out.println(ch.length);// 배열의 크기 
		for(int i = 0 ; i <ch.length; i++)
			System.out.printf("%c",ch[i]);
		
		System.out.println(ch[0]+ch[1]+ch[2]+ch[3]); // --영어가 출력 안됨 
		System.out.printf("%c%c%c%c",ch[0],ch[1],ch[2],ch[3]);
		

	}

}
