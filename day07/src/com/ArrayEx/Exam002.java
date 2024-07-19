package com.ArrayEx;

import java.io.*;
/*
 * 문]
 * 다음과 같이 5를 입력받아 다음과 같이 출력하시오. 
 * 
 * 정수 입력 : 5 
 * 		*****
 * 		****
 * 		***
 * 		**
 * 		*
 * 
 * 
 * 
 * */



public class Exam002 {

	public static void main(String[] args) throws IOException {
		
		int i ;
		int j ;
		
		for (i = 1 ; i<=5 ; i++) {
			for (j = 5; j >=i; j--) {
				System.out.print("*");
			}System.out.println();
		}
			
		
		
	}

}
