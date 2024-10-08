package com.exam;

public class Exam002 {

	public static void main(String[] args) {
		// 변수의 선언과 초기화 (메모리[=데이터를 저장하 공간] 값 할당한다)

		// 변수 선언 형식
		// 자료형 변수명; 또는 데이터 변수명 = 값
		// 변수 선언 및 데이터 입력 시 자료형에 맞는 값을 저장해야함
		// 정수형 데이터를 저장할 공간을 a 에 10을 저장한다. // 대입한다 라는 의미

		int a = 10;// 변수 선언 및 초기화

		int b; // 변수 선언
		b = 20;
		// 한번에 할 수도 있고 동시에 할 수도 있음 . 이렇게 2가지 방법

		int c, d; // 변수 2개 이상 동시에 선언시 변수와 변수를 ,로 구분한다 //10진수 // %d= 10진수 표현하는 방법
		// = : 이퀄은 대입문(대입연산자) 오른쪽 값을 저장한다는 뜻
		c = a + b;
		d = a - b; // 정수형은 음수 양수도 다 포함 . 소수점만 아니면됨

		System.out.println(a + "," + b + "," + c + "," + d); // 대부분 사용
		
		System.out.println(a + "," + b + "," + c + "," + d+"\n\n"); // 대부분 사용

		System.out.println(a + "," + b + "," + c + "," + d+"\n%n"); // 대부분 사용
		/*"\n%n" -> 둘다 사용시 뒤에는 문자로 인식해버림 이럴때는 \n\n 이렇게 사용 해야 2번 띄워짐 
		 * 
		 * 
		 * 숫자 + 문자열 + 숫자 + 문자열 --> int 다음 문자열이나옴 / 자바에서는 다른 자료형의 데이터들 끼리도 연산이 가능하다. 다른
		 * 자료형과 문자열의 +연산자로 연결하여 계산한다. --> 더해서 수치연산을 한것은 아님!
		 *
		 * 
		 * 
		 * 
		 */

		System.out.printf("%d,%d,%d,%d\n", a, b, c, d);
		System.out.format("%d,%d,%d,%d%n", a, b, c, d); // %n 똑같이 한줄 띄기
		// \n 과 %n --> 은 줄바꿈의 서식문자이다. 
		
		
		
		
	}

}
