package com02;

import java.io.*;


/*문]
 *시험 점수를 임의로 입력받은 후 점수가 80점 이상이면 합격 처리하는 프로그램 구현  
 *
 *
 */



public class IfEx02 {

	public static void main(String[] args)  throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("점수 입력 : ");
		int input = Integer.parseInt(br.readLine());
	
		if (input >= 80) {
			System.out.println("점수가 80점 이상입니다.");
			
		}else {
			System.out.println("점수가 80점 이상이 아닙니다.");
			System.out.printf("점수는%d입니다." ,input);
			
			
		}
		
	
		
		
		

	}

}
