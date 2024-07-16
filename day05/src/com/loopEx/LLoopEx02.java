package com.loopEx;
import java.io.*;

/*
 * 
 * 문2]
 * 주민번호를 입력받아 입력받아 8번째 자리로 출생지를 알아보는 프로그램을 구현해라 
 * 0 서울 / 1 경기 인천 / 2 부산 / 3 강원도 / 4 충청도 /5 전라도/ 6대구 광주 /7 경북 경남 /8 경남 /9 제주도 
 * 
 * 
 */


public class LLoopEx02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("주민번호 : ");
		
		char ju = br.readLine().charAt(8);
		
		switch (ju) {
		case '0':
			System.out.print("출생지는 서울 입니다.");
		break ;
		
		case '1':
			System.out.println("출생지는 경기 또는 인천입니다.");
		break;
		
		case '2':
			System.out.println("출생지는 부산입니다.");
		break;
		
		case '3':
			System.out.println("출생지는 강원도입니다.");
		break;
		
		case 4:
			System.out.println("출생지는 충청도입니다.");
		break;
		
		case 5:
			System.out.println("출생지는 전라도입니다.");
		break;
		
		case 6:
			System.out.println("출생지는 대구 또는 광주입니다.");
		break;
		
		case 7:
			System.out.println("출생지는 경북 또는 경남입니다.");
		break;	
		
		case 8:
			System.out.println("출생지는 경남입니다.");
		break;
		
		case 9:
			System.out.println("출생지는 제주도입니다.");
		break;
		
		default:
			System.out.println("주민 번호를 다시 입력해 주세요");
			break;
			
		}
		
	}

}
