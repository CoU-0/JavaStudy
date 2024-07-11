package com02;

import java.io.*;
import java.util.*;
/*
 *문] 
 *  점수의 학년을 입력받아 60점 이상이면 합격. 미만이면 불합격 
 *  단! 학년이 4학년인경우 70점 이상이면 합격, 미만이면 불합격 
 *  1~ 4학년까지 점수는 0~ 100점 
 * 
 * 
 * 
 */

public class IfEx008 {

	public static void main(String[] args) throws IOException {

		
		int sum, year;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("점수입력 :");
		sum = Integer.parseInt(br.readLine());

		System.out.println("학년 입력 :");
		year = Integer.parseInt(br.readLine());

		if (sum >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.print("불합격");
			}

		if (sum >= 70) {
			if (year >= 4) {
				System.out.println("합격입니다.");
		}

	}

}
}