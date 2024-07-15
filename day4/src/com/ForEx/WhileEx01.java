package com.ForEx;

import java.util.*;

/*
 * 초기값 
 * while (조건){
 * 
 * 증감
 * }
 *  문 ] 하나의 정수를 입력받은 수만큼 --> 숫자를 입력ㅎ면    /// 입력받은 숫자만큼 입력 
 *  "Hello world" 를 출력하는 프로그램을 구현하시오 
 * 
 * */

public class WhileEx01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("정수입력");
		num = sc.nextInt();

		int i = 1;
		while (i <= num) {
			System.out.println("Hello world");
			i++;
		}

	}

}
