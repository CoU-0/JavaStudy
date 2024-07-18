package com.exam;

/*		short : 2byte 정수형 
 * 				 (-32768 ~ 32767 까지의 범위 )
 * 				 정수 양의 수만 가져왔을 때 : 0 ~ 65535
 * 		
 * 
 * 
 * */




public class ShortEx {

	public static void main(String[] args) {
		short s = 0;// 초기값을 설정하지 않으면 컴파일러에서 에러를 발생시킨다.
						 // why? : 초기값 설정 해야만 올바른 값을 얻을 수 있기 때문
						 //			  아니면 쓰래기 값이 저장됨 
		System.out.println("short s : "+s);//
		
		
		
	}

}
