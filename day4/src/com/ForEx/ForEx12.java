package com.ForEx;

public class ForEx12 { // 역삼각형 

	public static void main(String[] args) {
		
		for(char a = 'A'; a <='Z' ; a++) {
			
			for (int c = 0; c <a-65; c++) {
				System.out.print(" ");

			}
			for (char b = a; b<='Z'-(a-65); b++) {
				System.out.print(b); //"*"
			}
			System.out.println();
		}
			
		
		
		
	}

}
