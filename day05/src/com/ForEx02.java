package com;

public class ForEx02 {

	public static void main(String[] args) {
		/*
		for(int i = 1 ; i <=5; i++) { // 행이 1개 10개 
			//System.out.println("**********");
			for (int j = 1; j<=5; j++) {// 열에 10개 
				System.out.print("*");
		}
			System.out.println();
		}
		/*	
		for (int j = 1; j<=10; j++) {// 열에 10개 
			System.out.print("*");
		}
		*/

		for(int i = 1 ; i <=10; i++) { // 행이 1개 10개 
			//System.out.println("**********");
			for (int j = 1; j<=i; j++) {// 열에 10개 
				System.out.print("*");
		}
			System.out.println();
		}
		
		
		
	}

}
