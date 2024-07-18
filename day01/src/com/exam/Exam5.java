package com.exam;

import java.io.*; //버퍼 
/*
 *  문제 : 
 *			사용자로부터 국어 영어 수학점수를 입력받아 총점을 구하는 프로그램을 구현하시오 
 * 
 * 
 * 
 * */

public class Exam5 { 

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int kor, eng, mat, sum = 0;
		
		

		System.out.print("국어 점수 :");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어 점수 :" );
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학 점수 :" );
		mat = Integer.parseInt(br.readLine());
		
		sum = kor + eng + mat;
		System.out.print("총합 점수 :" + sum);

	}

}
