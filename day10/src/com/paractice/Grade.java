package com.paractice;

import java.util.*;

public class Grade {
	Scanner sc = new Scanner(System.in);
	int mat;
	int sci;
	int eng;


	public Grade() {

		System.out.println("수학 : ");
		mat = sc.nextInt();
		System.out.println("과학 : ");
		sci = sc.nextInt();
		System.out.println("영어 : ");
		eng = sc.nextInt();

	}

	public double average() {
		 
		return (mat + sci + eng) / 3;
	} //반환 할꺼 이기 때문에 그냥 리턴에 바로 넣음 

	public static void main(String[] args) {

		Grade gr = new Grade();
		System.out.println("평균은 "+gr.average());

	}

}
