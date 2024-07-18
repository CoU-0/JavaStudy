package com.exam;
	/*
	 *char : 2byte [unicode 에서 사용 ] - ''싱글쿼터 사용 
	 *			ex) ch = '\u0041' -> 유니코드 방식 
	 *				 ch = 65, 일때 ch = 'A' 로 출력 
	 * 			아스키코드 - 1byte 문자를 표현하기 때문에 0 ~ 255 / 
	 * 			유니코드는 세계문자 표준  - 2byte 문자를 표현함 
	 * 										   0~ 65535
	 * 
	 * 			한글 한자 같은 피영어권 문자를 2byte로 표현하기에 부족해서 1byte를 추가해서 할당하는 방법이 유니코드방식 
	 * 			
	 * 
	 * 
	 * 
	 * */


public class CharEx {

	public static void main(String[] args) {
		char ch1 = '\u0041', ch2='A';     // 65+65 가 되면 수치 계산이 되어서 넘어가지 않음 
		System.out.println(ch1 + ch2); // ch1 +ch2
		System.out.println((ch1 + ch2)); // ch1 +ch2
		// 계산이 간으할 경우에만 숫자로 변경 
		System.out.println((char)(ch1 + ch2)); // ch1 +ch2 // 유니코드 일 경우 char 문자로 바꿧기 때문에 계산이 안됨 
		
		
		
	}

}
