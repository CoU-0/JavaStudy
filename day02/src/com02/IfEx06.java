package com02;

import java.io.*;

/*
 *문] 
 *국어 영어 수학 사회 과학 과목의 점수를 입력받아  
 *총점과 평균을 구하고  평균을 이용하여 학점을 판정하는 프로그램을 구현하시오
 *단, 다중 if문으로 구현 
 * 
 * A 90이상   
 * B 80~ 89이상
 * C 70~79
 * D 60 ~69 
 * F  60이하 
 * 
 * 
 */



public class IfEx06 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
		int kor, eng, mat, soc, sci, ave, tot = 0;
		char grade= ' ';
	
		
		
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
		
		System.out.print("당신의 총점은 "+tot+"점 입니다." );
		
		//tot = Integer.parseInt(br.readLine());
		
		
		if (ave>=90) {
			//System.out.print("당신의 점수는 A입니다. " );
			 grade ='A';
		}else if (ave>=80 &&  ave <=89 ) {
			//System.out.print("당신의 점수는 B입니다. " );
			 grade ='B';
		}else if (ave>=70 &&  ave <=79 ) {
			//System.out.print("당신의 점수는 C입니다. " );
			 grade ='C';
		}else if (ave>=60 &&  ave <=69 ) {
			//System.out.print("당신의 점수는 D입니다. " );
			 grade ='D';
		}else {
			System.out.print("당신의 점수는 F입니다. ");
			 grade ='F';
		}
		
		System.out.println("당신의 점수는 :"+ave+"입니다.");
		
		
	}

}
