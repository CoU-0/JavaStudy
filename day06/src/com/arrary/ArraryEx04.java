package com.arrary;

public class ArraryEx04 {

	public static void main(String[] args) {

		
		// String [] str = {"국어""영어""수학"} / 과 같음 
		
		
		
		for ( int i =0 ; i < args.length; i++) {
		System.out.println((i+1) +"번째 과목 :" +args[i]);
		}
		/*
		if (args.length != 1) {
			System.out.println("입력된 값이 없습니다.");  // 문자열 이었을때 - 안됨  
			System.exit(0);
		}
		/*
		int x = Integer.parseInt(args[0]);
		
		
		System.out.println("args[0] :" +args[0] );
		System.out.println("args[1] :" +args[1] );
		System.out.println("args[2] :" +args[2] );
		*/
		


	}

}
