package com.arrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayExam05 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.println("이름 입력: ");
		String name = br.readLine();
		
		// 과목명을 가지고 배열 선언 
		String[] subname = {"국어","영어","수학"};
		int jumsu[] = new int [subname.length+1]; // 처음부터 늘려놓음 
		// int jumsu[] = new int [4]
		// jumsu[0] jumsu[1] jumsu[2] jumsu[3] 
		// 국어점수	 영어점수	  수학점수		총점 
		
		for (int i =0 ; i<jumsu.length-1;i++) { // jumsu.length -> 점수만 담긴 상자 
			do {
				System.out.print(subname[i]+"점수 :");
				jumsu[i] = Integer.parseInt(br.readLine());
			}while (jumsu[i]<0 || jumsu[i]>100 ); // 0보다 작으면 안되고 100보다 크면안돼 // 정수 범위 
			// do - while 안에 총점을 입력해서 출력 
			jumsu[jumsu.length-1] += jumsu[i]; // 
	
		}
		System.out.print("총점 :" + jumsu[jumsu.length-1]);
		
		
		float avg = jumsu[jumsu.length-1]/ (float) jumsu.length-1;
		
		System.out.print("평균 :" +avg);

		
	}

}
