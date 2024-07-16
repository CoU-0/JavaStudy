package com;

/*
 *		역삼각형 
 * 
 */

public class StarEx03 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i ; j++) { // 공백이 0이다? 
				System.out.print("  ");

			}
			for (int j =i+1*i; j<9; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
