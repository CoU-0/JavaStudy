package com;

/*
 * a에서부터 z 까지 출력하는 프로그램을 구현.
 * 
 * 
 * 
 * 
 */


public class LoopEx03 {

	public static void main(String[] args) {

		char c = 'a';
		
		do {
			System.out.println(c);
			c = (char)(c+1); // 증감식;;
		}while (c<='z');
		
		
		
	}

}
