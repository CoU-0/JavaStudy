package com.ArrayEx;

import java.io.*;
import java.util.Scanner;
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



public class Exam02 {

	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("정수입력");
		int n = sc.nextInt();
		
		int i ;
		int j ;
		
		for (i = n ; i >0 ; i--) {
			
			for (j = 0; j < i;  j++) {
				System.out.print("*");
			}System.out.println();
		}
			
		
		
	}

}
