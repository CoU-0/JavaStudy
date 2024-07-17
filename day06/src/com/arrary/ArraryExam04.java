package com.arrary;
/*
 * 
 * 		배열을 이용하여 한명의 하생에 대해 성적을 처리하는 프로그램을 구현하라
 * 		단, 과목명은 main함수의 매개변수를 활용하여 구현한다. 
 * 
 * 
 * 
 */

import java.io.*;

public class ArraryExam04 {

	public static void main(String[] args) throws IOException {
         
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  
			if(args.length ==0){
				System.out.print("값이 없습니다.");
				System.exit(0);
			}
			
			System.out.println("이름 입력: ");
			String name = br.readLine();
			
			// String[] subject = {"국어","영어","수학"};
			String[] subject = new String[args.length];
			for(int i = 0; i < args.length; i++) {
				subject[i] = args[i];
				//System.out.println(subject[i]);
			}
			
			int jumsu[] = new int[subject. length+1]; // 공간을 늘림 
		 
			
			for (int i = 0; i< jumsu.length-1 ; i++) { // 0~ 2까지의 값을 가져오는것 -  > 이건 0 1 2 점수만 들어있는 인덱스 
				System.out.print(subject[i]+"과목 점수 :");
				jumsu[i] = Integer.parseInt (br.readLine()); // 과목별 점수를 입력받는다.
				// 받은 점수를 입력받은 점수를 누적하여 합계를 구한다. 
				
				jumsu[jumsu.length-1] += jumsu[i];
			
	}
			System.out.println("총점 : "+jumsu[jumsu.length-1]);
			float avg = jumsu[jumsu.length-1] / (float)subject.length;
			System.out.println(avg);
	
	}
}
