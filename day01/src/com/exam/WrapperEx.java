package com.exam;
/*
 * Wrapper Class 
 * 		-기본 자료형을 객체화 시킴(객체 속에는 매소드가 있음)
 * 		- 
 * 		byte > Byte 
 * 		short > Short
 * 		int > Integer
 * 		long >Long 
 * 		float > Float 
 * 		double > Double
 * 		boolean > Boolean 
 * 		char > Character
 * 		
 *  
 * */
public class WrapperEx {

public static void main(String[] args) {
		
		byte a_min = Byte.MIN_VALUE;
		byte a_max = Byte.MAX_VALUE;
		
		char	b_min = Character.MIN_VALUE;
		char	b_max = Character.MAX_VALUE;
        
		System.out.println(a_min);
		System.out.println(a_max);
		System.out.println(b_min);
		System.out.println(b_max);
		
		
		//숫자를 문자열로 변환시키는 방법 
			String ss = String.valueOf(33);

			
			
	   // 문자열을 숫자로 변환시키는 방법 
		String str = "10"; // 더블쿼터 - 문자열로 취급 
		byte b = Byte.parseByte(str); // 정수형으로 바꾸려고 할때 안에 str 넣어줌 
		short s = Short.parseShort(str); // 정수형 
		int i = Integer.parseInt(str); 
		long l = Long.parseLong(str); 
		float f = Float.parseFloat(str); // 실수형 
		double d = Double.parseDouble(str); // 실수형 
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ss);
		System.out.println(ss+10);
		
		
		
		
		
		
	}
	
	
	
}
