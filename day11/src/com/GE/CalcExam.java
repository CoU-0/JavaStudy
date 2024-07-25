package com.GE;

/*
 *  상속을 이용한 계산기 프로그램을 
 *	정수 2개를 받아 정수와 연산자를 입력 받아 
 */

import java.io.*;


class AClass {

	
	protected int x, y; //상속일때는 프로택티등 
	protected char op;

	public AClass() {}
	
	public void display (double result) {
		System.out.printf("%d %c %d = %.2f%n",x , op , y , (x+y));
	}
}

// BClass : 데이터 입력기능, 연산 및 처리 기능 
 class BClass extends AClass{
	 
	 //데이터 입력 기능 
	 boolean input () throws IOException  { // 입력을 무엇으로 받을지가 중요함 퍼블릭 생략해도 산관없음  
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.println("임의의 두정수 입력 : ");
		 String temp = br.readLine(); // "10, 20"
		 String [] str = temp.split("\\s"); // { "10", "20"}
	 
		 if(str.length !=2) {
			 return false;
		 }
		 
		 x = Integer.parseInt(str[0]);
		 y = Integer.parseInt(str[0]);
		 
		 System.out.println("연산자 입력 [+ - * / ] :");
		 op = (char)System.in.read();
	 
		 if(op == '+' || op== '-'|| op== '*'|| op== '/')
			 return true;
		 
		 return false; 
	 }
	 
	 
	 //연산 및 처리기능 
	 double calc() {
		 
	 }
	 
	 
	 
	 
 }


public class CalcExam {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

	}

}
