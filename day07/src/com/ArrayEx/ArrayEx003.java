package com.ArrayEx;

/*
 * 	문]
 * 	5명의 학생의 세 과목 점수를 더해서 각 학생의 총점과 평균을 구해라 
 * 총점은 과목별 총점 
 * 
 * 	번호 	국어 	영어 	수학 	총점	평균(실수형으로 ) 
 * 	1		
 * 2
 * 3
 * 4
 * 5
 * 총점  300  500  	400  300  
 * 
 * for -> 
 * 
 * 
 * */

public class ArrayEx003 {

	public static void main(String[] args) {

		int [][] score = {
				{100, 100, 100}, // 0 0 
				{20, 20, 20},		// 1 0
				{30, 30, 30},     // 2 0
				{40, 40, 40},		// 3 0
				{50, 50, 50}		// 4 0
		};
		
		for (int i = 0; i < score.length;i++ ) {
			for (int j = 0; j < 1; j++)
				System.out.println(score);
		}
		
		
		
		
		

		
		
		
	}

}
