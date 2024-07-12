package com.switchEx;


/*
 * switch ~case 문   
 * - 조건 값에 따라 여러개의 처리문을 한번에 수행 
 * - 조건 값으로 올 수 있는 자료형 : 정수형, 문자형
 * - 올 수없는 자료형 : Long, boolean float double --> 강제로 정수형으로 형변환 가능 
 * 
 * avg = sum /5.0 ===
 * (int)avg -> 이런식으로 강제로 바꿈  = integer.parseInt(br.readLine)
 *   
 * braek 문
 * - 하나의 조건 값마다 필요하다.
 * - 만약 break문이 없을 경우 다음 break문을 만날때 까지 계속 수행한다. 
 * - case 문과 일치하는 경우가 없다면 default문을 수행한다. 
 *   주의사항 : case 뒤에 오는 조건의 값이 중복되지 않도록 해야한다.
 * 
 */
/*
 * 문제 ]과목 3개를 입력받아
 *       총점 평균 구해 평균을 이용하여 학점 만들기 / 단 switch ~case 문을 활용  
 * 
 */

import java.io.*;
import java.nio.Buffer;


public class SwitchEx01 {

	public static void main(String[] args) throws IOException {
	  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng, mat, sum;
		float avg;
		
		
		System.out.println("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.println("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.println("수학 점수 : ");
	    mat = Integer.parseInt(br.readLine());

	   sum = kor + eng +mat ;
	   
	   avg = sum /3.f;
	
	   //System.out.println(avg);
	   System.out.printf("평균은 %.2f\n",avg);
		
	   
	   switch ((int)(avg/10)) { // 나누기 10 했으니 숫자를 작게씀 / 그래서 10으로 나눔 
	   
	   case 10:
	   case 9: // 10으로 나눴을때 90점 이상이니까 둘다 묶어서 사용 
	  System.out.println("당신의 학점은 A입니다.");
	   
	   break;
	   case 8:
	   System.out.println("당신의 학점은 B입니다.");
	   break;
	   case 7:
	   System.out.println("당신의 학점은 C입니다.");
	   break;
	   case 6:
	   System.out.println("당신의 학점은 D입니다.");
	   
	   	default:
	   		System.out.println("당신의 학점은 F입니다.");
	 	   
	   }
		
	
		
	}

}
