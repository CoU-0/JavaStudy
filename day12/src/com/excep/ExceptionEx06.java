package com.excep;
/*
 * 예외 전가
 *  throws 예약어
 *  
 *  
 * 
 * 
 * 
 * 
 */
public class ExceptionEx06 {
	
	private static void test() throws Exception{
		System.out.println(6/0);
	}

	public static void main(String[] args) throws Exception{
	//try {
		test();
	//}catch(Exception e) {
	//	e.printStackTrace();
//	}
		

	}

}
