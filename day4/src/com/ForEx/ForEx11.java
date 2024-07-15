package com.ForEx;

public class ForEx11 {

	public static void main(String[] args) {
		
		for (char i ='A'; i <= 'Z'; i++) { // 삼각 형 
			
			for (char j = 0; j < i-65; j++) {
				System.out.print(" ");
			}
			for(char c = i; c<='z'-(i-65); c++) {
				System.out.print("c");
						
			}
			System.out.println();
			
		}
		
		
		
	}

}
