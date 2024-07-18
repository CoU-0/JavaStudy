package com.exam;

import java.oi.*;  // 003 직접 작성  - 오답 
/*
 *  문제 : 
 *			사용자로부터 국어 영어 수학점수를 입력받아 총점을 구하는 프로그램을 구현하시오 
 * 
 * 
 * 
 * */

public class Exam4 {

	public static void main(String[] args) {

		int kor, eng, mat, sum = 0;
		Scanner sc = new Scanner(System.in);

		
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		sum = kor + eng + mat;
		
		
		System.out.print("국어 점수 :");
		System.out.print("영어 점수 :" + eng);
		System.out.print("수학 점수 :" + mat);
		System.out.print("총합 점수 :" + sum);
	}

}
