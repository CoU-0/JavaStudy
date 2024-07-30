package com.excep;


//예외의 실행 순서
public class ExceptionEx02 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4/0);
		}catch(Exception e) {
			System.out.println(5);
		}

		System.out.println(6);
	}

}
