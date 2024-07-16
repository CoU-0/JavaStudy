package com;

public class Exam02 { // 컨티뉴 

	public static void main(String[] args) {

		int n =0, s=0;
		
		while (n <100) {
			n++;
			if (n %2==0) //짝수 패스 
				continue; // 건너뛰기 
			s += n;// 홀수  // 짝수가 들어가지 않음? 
		}
		System.out.println("결과 : "+s);
		
	}

}
