package com.ForEx;

/*
 * Do while - 무조건 한번은 실행 
 * 
 *  do {
 *  	 실행문;
 *  	 실행문;
 *  	 증감
 *  }while(조건식);
 * 
 * 	실행문 무조건 한번은 실행한다. 
 * 
 * */
import java.util.*;

public class DoWhileEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int subject = 0;
		do {
			System.out.print("점수 :");
			subject = sc.nextInt();            // 무조건 이 구문은 들어간다. 
		}while(subject < 0 || subject >100 );
		

	}

}
