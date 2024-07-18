package com.exam;

import java.util.Scanner; // 외워야함 

import java.io.*;    //io안의 클래스를 모든 것을 불러오겠다는 의미 --> 한줄로 쓰는 방법 
/*
import java.io.BufferedReader; // 
import java.io.InputStreamReader;
import java.io.IOException;
*/

/*
 * 원의 넓이와 둘레를 구하는 프로그램을 구현하시오.
 * 원의 넓이 : 반지름 * 반지름 * 3.141592 // 
 * 원의 둘레 : 반지름 * 2 * 3.141492 // 실수형 - double 
 * 반지름 : 5 
 * 반지름이 5인 원의 둘레
 * 반지름이 5인 원의 넓이  
 * 
 */

public class Exam01 {

	public static void main(String[] args) throws IOException{ // 이렇게 해야지 ??
		
		
		
		
		/*
		 * system.in (input) : 키보드로 직접 키를 입력받아서 처리하는 표준 입출 스트림 객체
		 * 								사용자로부터 직접 입력 받는 것을 의미한다.  
		 * 
		 * system.in : 바이트 표준 입력 --> byte데이터 연결 / 
		 * 					--> 바이트 데이터를 문자로 변환 
		 * (바이트 데이터? : 5 입력 --> (바이트코드로 변환 )--> 101(2진수) --> 문자로 변환 해서 사용됨 ??   
		 * 
		 * */
		
		// 스캐너 객체를 생성한다는 의미 
		// -> System.in : 객체를 인용하여 키보드로부터 바이트 정보를 입력받고 / NewExSub 타입의 nes 객체 선언
	   //						입력받은 바이트들을 (정수 실수 문자열 문자)로 반환하여 리턴함 
		
		//일본스타일 코딩방법 
		// 버퍼는 - 임시기억했다 엔터와 동시에 지워 입력을 받을 수 있게끔 만드는 역할 / 문자열로 들어옴 
		// 스트림 객체 생성 완료 
		// 그래서 문자열을 정수로 바꿔줘야함 ---> paser
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// system in 키보드로 입력해서 버퍼에 쓰였던것을 버퍼에 저장을 한다 =br (1) 엔터 치기 전까지 임시 저장공간 
	  
		
		System.out.print("반지름 입력 : ");
		int r = Integer.parseInt(br.readLine()); // 괄호에 있는 걸 받겠다.  (2) br을 읽어 r로 다시 들어감 --> 정수들어간다는 대충 긴 이야기 
		
		
		
		// 한국 스타일 코딩방법 
		//Scanner sc = new Scanner(System.in); // 시스템 - > 키보드 입력 
		//System.out.print("반지름 입력 : ");
		//int r = sc.nextInt(); // 정수형이 입력받는 부분 
		//int r = 5; // 반지름값, 변수활용하여 출력
		
		
		
		
		
		double a, b;
		// 원의 넓이 =a
		a = r * r * 3.141592;
		//원의 둘레 
		b = 2* r * 3.141592;
		
		System.out.println("원의 넓이 :" +a);
		System.out.println("원의 둘레 :" +b);
		System.out.printf("원의 둘레 : %.2f%n" ,a);
		System.out.printf("원의 둘레 : %.2f%n" ,b);
	
      
	}

}
