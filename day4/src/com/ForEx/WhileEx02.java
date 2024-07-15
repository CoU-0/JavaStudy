package com.ForEx;
import java.util.*;

/*
 * 
 * 사용자로부터 하나의 숫자를 입력받아 그 수만큼 3의 배수를 출력하는
 * 프로그램을 구현하시오 
 * 
 * 만약 5가 입력되었다면 3 6 9 12 15  까지 의 배수가 입력 되어야함 
 * 
 * */


public class WhileEx02 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int n ;
	int a = 1;
	System.out.println("숫자를 입력하세요");
	n = sc.nextInt();
	
    while (a <=n);{
    System.out.println(3*a+"\n");
	a++ ;
	}
    
	}
}
