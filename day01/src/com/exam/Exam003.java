package com.exam;

import java.util.*;
/*
 *  문제 : 
 *			사용자로부터 국어 영어 수학점수를 입력받아 총점을 구하는 프로그램을 구현하시오 
 * 
 * 
 * 
 * */




public class Exam003 { //스캐너 

	public static void main(String[] args) {

	  int kor, eng, mat, sum = 0; // 초기값을 잡아야 에러가 안남 
	  Scanner sc = new Scanner(System.in); 
	 
	  //입력받는 안내 메시지 출력 
	  System.out.print("국어 점수 :");	//ln을 붙이면 같이 나온다? --> 옆에 입력이 안되고 아래에 입력이 됨 
	  kor = sc.nextInt();
	  
	  System.out.print("영어 점수 :");	//ln을 붙이면 같이 나온다? --> 옆에 입력이 안되고 아래에 입력이 됨 
	  eng = sc.nextInt();
	  System.out.print("수학 점수 :");	//ln을 붙이면 같이 나온다? --> 옆에 입력이 안되고 아래에 입력이 됨 
	  mat = sc.nextInt();
	  // 각 과목을 입력받아 변수에 !!!저장한다!!! 
	  
	  sum = kor + eng + mat;
	  
	  System.out.print("합계 :"+sum);	//ln을 붙이면 같이 나온다? --> 옆에 입력이 안되고 아래에 입력이 됨 
	
	  
	
	 
	}

}
