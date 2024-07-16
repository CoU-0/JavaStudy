package com;

/*
 *		           *
 *		      * * *
 *		   * * * *
 *		* * * * * 
 * 
 * 
 */

public class StarEx01 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 4; j++) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i*2 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
