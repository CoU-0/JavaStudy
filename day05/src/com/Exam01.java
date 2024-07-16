package com;

/*
 * 
 * break : while, do ~while, for , swicht~ case
 * 
 * 			반복문 즉시 종료 
 * */



public class Exam01 {

	public static void main(String[] args) {

		int n=0 , s=0;
		
		while(true) {
			n++;
			s += n;
			if (n>=10)
				break;
		}
		System.out.println("결과 : "+s );
		
		
	}

}
