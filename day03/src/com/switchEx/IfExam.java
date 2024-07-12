package com.switchEx;



/*
 * 삼항 연산자 
 * - 세계의 항목으로 이루어져 있다. 
 *  
 *  조건항? 항1                :(else 와 같음) 항2 ;    // 해석 : 
 *   		조건이 참 일때 		조건이 거짓일때
 * 	Ex ) 
 *        if (조건 ) {}          esle {}
 *        이것과 같음 if 참이면 출력 / 거짓이면 else   
 * 
 * */

public class IfExam {

	public static void main(String[] args) {
		
		int a = 10;
		
		//(a == 10) ? System.out.println("같다") : System.out.println("다르다"); // 문장 끝에 세미콜론 
		
		String str = a == 10 ? "같다" : "다르다";
		if (a ==10) 
			str = "같다";
	     	
		else 
			str = "같지 않다";
		
		
		System.out.println(a==10? "같다" : "같지않다"); // 항이 3개 == 삼항 연산자다~
		
		
		
     
	}

}
