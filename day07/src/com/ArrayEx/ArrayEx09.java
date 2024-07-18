package com.ArrayEx;


/*
 * 3명에 대해서 총점 ,평균, 석차를 구하시오  
 * 
 * 
 * 
 * */
import java.io.*;
import java.nio.Buffer;


public class ArrayEx09 {

	public static void main(String[] args) throws IOException {
     
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] subname = {"국어","영어","수학"};
		int[][]sub = new int[3][subname.length+1]; // 스트링값이 변할 수도 있으니까? 
		// 0 - 국어 1- 영어 2- 수학 3- 총점 까지 저장할 공간 
		float[] avg = new float[3];
		
		
		//과목별 정수를 입력받고 총점을 구하라 
		for (int i = 0 ; i <sub.length; i++) {
			for (int j = 0; j <sub[i].length-1;j++) {// 국영수가 들어가 있는 자리에서만 추출 0 ->ㅁㅁㅁㅁ 
				do {
					System.out.print(subname[i]+"점수 :");
				sub[i][j] = Integer.parseInt(br.readLine());
				}while (sub[i][j]< 0 || sub[i][j]>100) ; 
				 // 총점구함 
				sub[i][sub[i].length-1] += sub[i][j];
			}
			avg[i] = sub[i][sub[i].length-1]/(float)(sub[i].length-1);
			
			
		}
		for(int i = 0; i<sub.length;i++) {
			
			System.out.println();
			System.out.println("총점 : "+sub[i][sub[i].length-1]);
			System.out.println("평균 : "+avg[i]);
			
		}
		
		
		
		
	}

}
