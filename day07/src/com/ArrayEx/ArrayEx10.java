package com.ArrayEx;

import java.io.*;

public class ArrayEx10 {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 배열 선언 및 초기화 
		String [] subname = {"국어", "영어", "수학"};
		
		int[][] sub = new int[3][subname.length+2];
				// subname.length+2 =5  -->/ 0 =국어/ 1= 영어 /2= 수학 /3 =총점/ 4 = 석차 
				// 점수만 입력 받는다 -> -2를 해야지 점수를 입력받을 수 있음 
				// 평균 
				float[] avg = new float[3]; // 사람 3 - 3개의 평균 
		
		// 각 과목을 점수를 입력받아 총점과 평균을 구함 
		// 점수의 범위는 0~ 100까지의 범위로 한다. 
		
	    //사람 행 - 
		for (int k = 0; k <sub.length;k++) {
			for (int i = 0; i<sub[k].length-2;i++) { // 현재 5개이니까 012 3개만 있으면 되니까 -2 
				// 0~ 100 사이의 수를 do while 문을 이용하여 작성 
				do { // i 과목의 점수를 가져와야하니까 - > 열인 아이를 가져와야함 
					System.out.print(subname[i]+"점수 : ");
					sub[k][i] = Integer.parseInt(br.readLine());
				}while(sub[k][i]<0 || sub[k][i] >100);
				// 입력받은 과목의 점수가 0보다 작거나 100보다 크면 다시 수행한다. 
				
				//총점 구하기 
				sub[k][sub[k].length-2] += sub[k][i];
			}
			//System.out.println();  ---- 1번째 출력체크 
			//평균구하기 
			avg[k] = sub[k][sub[k].length-2] / (float)(sub[k].length-2);
			
			sub[k][sub[k].length-1] = 1;
			
			
		}
		
		//석차구하기 
		// 총점을 이용해서 석차를 구한다. 
		for (int k = 0 ; k<sub.length;k++) { // 처음 들어온 사람
			for (int i = 0; i <sub.length; i++) {  // 두번째 들어온 사람 
				if(sub[k][sub[k].length-2] < sub[i][sub[i].length-2]) // 
					// 첫번째 사람이 두번째 사람과 비교해서 두번째 사람보다 점수가 총점이 작으면 등수는 석차는 1에서 2로 증가시킨다.
				// 원래대로 라면 1등인데 점수가 두번째 보다  낮아지니까  - > 하나 증가시킴 
				sub[k][sub[k].length-1] ++; // 얘가 점수가 낮으니까 석차가 증가된다는 의미 
			
			}
			
		}
			for(int k = 0; k<sub.length;k++) {
			
			System.out.println();
			System.out.println("석차 : "+sub[k][sub[k].length-1] +"등");
			System.out.println("총점 : "+sub[k][sub[k].length-2]);
			System.out.println("평균 : "+avg[k]);
			
			
			
			}
		
	}

}
