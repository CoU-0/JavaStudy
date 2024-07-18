package com.exam;

import java.io.*;

public class InputEx03 {

	public static void main(String[] args) throws IOException {
		// 숫자를 입력 받을 때는 아스키코드 값을 빼주면 된다.
		// 숫자 입력 : System.in.read() - 48 or '0' ( 0은 문자)
		int num1, num2; // 입력을 받는다 라는 의미

		System.out.print("1번 : ");
		// num1 = System.in.read()-48; // 아무리 높은 숫자가 입력되어도 1번만 입력됨 //sysin 이 아스키코드값임
		num1 = System.in.read() - 48; // 숫자가 아니라 문자 0일때 숫자가 아니라 문자 0일때 아스키 코드값으로 환산할때 5가 53 / 이런 원리를 이용해서 숫자 하나만ㄴ

		System.in.read();// \r을 받아서 처리 ===>13?
		System.in.read(); // 뭔말임 ; --> \n을 받아서 처리

		// System.in.skip(2);
		System.out.print("2번 : ");
		num2 = System.in.read() - '0';

		System.out.println(num1 + num2);
		// 문자가 들어가게 되면 아스키 코드로 변환되어서 출력 ---> 48 - 문자값 =출력  
	}

}