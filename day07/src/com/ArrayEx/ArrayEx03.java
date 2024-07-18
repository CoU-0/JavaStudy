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

public class ArrayEx03 {

	public static void main(String[] args) {

		int [][] score = {
				{100, 100, 100}, // 0 0 
				{21, 20, 22},		// 1 0
				{31, 30, 32},     // 2 0
				{41, 40, 42},		// 3 0
				{51, 50, 52}		// 4 0
		};
		
		int korTot =0, engTot =0, matTot =0;
		System.out.println("번호    국어		영어 		수학");
		System.out.println("------------------------------");	
		
		
		for (int i = 0; i < score.length;i++ ) {
			// 개인별 총점  
			int sum = 0;	float avg = 0.0f;
			
			korTot += score[i][0];
			engTot += score[i][1];
			matTot += score[i][2];
			System.out.printf("%5d",i+1);
					
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j]; // 개인별 총점
				System.out.printf("%7d",score[i][j]);
			}
			 
			
	     
			//개인별 평균
			avg = sum / (float)score[i].length;
			System.out.printf("%5d %5.1f %n",sum,avg);
			
		}
		System.out.println("------------------------------");	
		System.out.printf("%12d%8d%8d%n", korTot, engTot, matTot);
	
	}

}
