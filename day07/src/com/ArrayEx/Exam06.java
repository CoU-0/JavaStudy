package com.ArrayEx;

/*
 * 과목과 점수가 짝을 이루도록 2개의 배열을 생성. 
 * 과목의 이름을 입력받아 점수를 출력하는 프로그램을 작성하시오
 * 단 "그만"을 입력하면 프로그램을 종료하세요. 
 * 
 * 
 * 배열 
 * 		String course[] = {"java","HTML","Datavase","JSP","Spring"};
 * 		int score[] = {60 70 85 76 89}
 * 
 * 		String 클래스의 equals() 메소드를 이용
 * 		equals() : 문자열의 비교, == : 값의 비교 
 * 
 * 
 * */

import java.util.*;

public class Exam06 {

	public static void main(String[] args) {

		String course[] = { "java", "HTML", "Datavase", "JSP", "Spring" };
		int score[] = { 60, 70, 85, 76, 89 };

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("과목이름 : ");
			String name = sc.next();
			if (name.equals("그만"))
				break;

		

		int i;
		for (i = 0; i < score.length; i++) {
			if (course[i].equals(name)) {
				System.out.println(name + "점수는" + score[i]);
				break;
			}
		}
		 if( i == score.length) {
			 System.out.println("없는 과목입니다. ");
		 }
		}System.out.println(" 점수 : ");
		
		
	}

}
