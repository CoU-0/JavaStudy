package com02;

import java.io.*;

/*
 * if문 안에 if 를 또 넣는것이 "중첩 if문"  --> if의 조건이 둘다 만족해야지 실행 
 *  if(조건식1번 ){
 *           조건식 1번의 결과가 true 일때 수행.
 *		if(조건식 2번 ) {
 *			조건식1번과 조건식2가 모두 true 일때 수행
 *      }else {
 *          조건식 1은 true이고  조건식 2는 false 일때 
 *      }
 * }else{
 * 조건식 1이 false 일때  
 * }
 * 
 * 
 * 
 * 
 * 
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfEx07 {

	public static void main(String[] args) throws IOException {
		
	
	
		
		int kor, eng, mat, soc, sci, ave, tot ;
		char grade= ' ', op= ' ';
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어 점수를 입력하세요");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어 점수를 입력하세요");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학 점수를 입력하세요");
		mat = Integer.parseInt(br.readLine());
		
		System.out.print("사회 점수를 입력하세요");
		soc = Integer.parseInt(br.readLine());
		
		System.out.print("과학 점수를 입력하세요");
		sci = Integer.parseInt(br.readLine());
		
		tot = kor + eng + mat + soc + sci;
		ave = tot / 5;
		
		System.out.println("당신의 총점은 "+tot+"점 입니다." );
		
		//tot = Integer.parseInt(br.readLine());
		
		
		if (ave>=90) {
			//System.out.print("당신의 점수는 A입니다. " );
			 grade ='A'; // A+ 일때 98점 이상일때  A+ , 95~97점 A,  90~94점 미만일 경우 A-
			 if (ave >=98 ) {
				 op ='+';
			 }else if (ave <94 ) {
				 op ='-';
				 
			 }
			 
			 
			 
			 
		}else if (ave>=80 &&  ave <=89 ) {
			//System.out.print("당신의 점수는 B입니다. " );
			 grade ='B';
			 
			 if (ave >=88 ) {
				 op ='+';
			 }else if (ave <84 ) {
				 op ='-';
				 
			 }
			 
			 
		}else if (ave>=70 &&  ave <=79 ) {
			//System.out.print("당신의 점수는 C입니다. " );
			 grade ='C';
			 
			 if (ave >=78 ) {
				 op ='+';
			 }else if (ave <74 ) {
				 op ='-';
				 
			 }
			 
		}else if (ave>=60 &&  ave <=69 ) {
			//System.out.print("당신의 점수는 D입니다. " );
			 grade ='D';
			 if (ave >=68 ) {
				 op ='+';
			 }else if (ave <64 ) {
				 op ='-';
				 
			 }
		}else {
			System.out.print("당신의 점수는 F입니다. ");
			 grade ='F';
		}
		
		System.out.printf("당신의 점수는 %c%c 입니다.",grade,op);
		
		
	}



	}


