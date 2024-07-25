package com.paractice;

import java.util.*;

public class Grade001 {

	private int mat; 
	private int sci;
	private int eng; 
	
	public Grade001(int mat, int sci, int eng) {
		
		this.mat = mat;
		this.sci = sci;
		this.eng = eng;
		
	}
	
	public int average() {
		return (mat + sci +eng)/3;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수학 과학 영어 순으로 3개의 점수를 입력 : ");
		int mat = sc.nextInt();
		int sci = sc.nextInt();
		int eng = sc.nextInt();
		
		Grade001 ge = new Grade001(mat,sci,eng);
		int avg = ge.average();
		System.out.printf("평균은 %d입니다.",avg);
		
		
	}

}
