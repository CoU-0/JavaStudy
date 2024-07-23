package com.objEx;
 

class MethodEx {

	public int add(int i, int j) {// (인자값 - 인자값에 int와 같은 자료형(=반환형)과 같 ) / -> 메소드 선언ㅇ
		return i + j; // 결과 반환 
	}

	public int sub(int i, int j) {// (인자값 - 인자값에 int와 같은 자료형과 같 ) / -> 메소드 선언ㅇ
		return i - j;
	}

	public int multi(int i, int j) {
		return i * j;
	}

	
	public int div(int i, int j) {
		return i / j;
	}
	
	
	
	
	
	
}
	public class MethodEx01 {

	public static void main(String[] args) {
		MethodEx  m  = new MethodEx();
		//메소드 호출 시 매개변수로 전달 
		int a = 10;
		int b = 20;
		System.out.println("덧셈결과 : " +m.add(a, b));
		
		System.out.println("뺄셈결과 : " +m.sub(a, b));
		System.out.println("곱셈결과 : " +m.multi(a, b));
		System.out.println("나눗셈결과 : " +m.div(a, b));
		
		
		
		//System.out.println("덧셈결과 : " + m.add(10,20));
		// 메소드 호출시 값을 전달함 
		
	}

}
