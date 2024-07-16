package com.loopEx;
import java.io.*;
/*
 * 문3]
 *	계산기 프로그램을 구현하시오 
 *	한번 계산 후 다시 계산 할 것인지를 물어보고 수행을 계속 할 것인지를 결정 /한번은 진행 - > do while  
 *
 * 	첫번째 정수 
 * 연산자 
 * 두번째 정수 
 * 
 * 
 * 계속 하시겠습니까? y/n 
 * 
 *  / % 연산자 나머지 값이 두번째 정수값이 0일 경우 / 0으로 나눌 수 없습니다. 진행하시겠습니까?  
 * 
 */




public class LLoopEx03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b =1;
		int result=0 ;
		char c =0 ;
		
		
		while (true) {
		
		System.out.println("첫번째 정수 : ");
		a = Integer.parseInt(br.readLine());
		
		do {
		System.out.println("연산자를 입력하시오");
		c = (char)System.in.read();
		System.in.read();
		System.in.read();
		}while (c != '+' && c !='-' && c !='*' && c !='/' && c !='%' && c !='%' );
			
			
		
			System.out.println("두번째 정수 : ");
			b = Integer.parseInt(br.readLine());
		if ((c == '/' || c == '%') && b ==0){
			System.out.println("0으로 나눈거나 나눈 나머지를 구할 수 없다.");
			continue;
		}
	
		
		switch(c) {
		case '+' : result = a+b;break;
		case '-' : result = a-b;break;
		case '*' : result = a*b;break;
		case '/' : result = a/b;break;
		case '%' : result = a%b;break;
		
		}
		System.out.println(a+" "+c+" "+b+"="+result);
		
	
		
		do {
			System.out.println("계속 하시겠습니까? (y/n)");
			c = (char)System.in.read();
			System.in.read();
			System.in.read();
		}while (!(c=='y'|| c =='Y'|| c =='n'|| c =='N'));
		if (c== 'N' || c=='n')
			break;
	 
		
	}
		System.out.println("계산프로그램을 종료합니다.");
}
}
