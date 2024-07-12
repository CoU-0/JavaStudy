package com.switchEx;

import java.io.*;
import java.io.InputStreamReader;

public class SwitchEx05 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, m = 0; // 
		char op;

		System.out.print("첫번째 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
      
		System.out.print("연산자 : ");
		op = (char) System.in.read();
     
		System.in.read();
		System.in.read(); // 아직도 잘 모르겠음 / 띄어쓰는 걸 빼주는 거
      
		System.out.print("두번째 정수 입력 : ");
		m = Integer.parseInt(br.readLine());
		
		switch (op) {
		case '+':
			System.out.printf("%d %c %d = %d", n, op, m, (n + m));
		break;
		
		case '-':
			System.out.printf("%d %c %d = %d", n, op, m, (n - m));
		break;
		
		case '*':
			System.out.printf("%d %c %d = %d", n, op, m, (n * m));
		break;
		
		case '/':
			System.out.printf("%d %c %d = %d", n, op, m, (n / m));
		break;
		
		case '%':
			System.out.printf("%d %c %d = %d", n, op, m, (n % m));
		break;
		
		default :
			System.out.println("연산자가 아닙니다");
			System.exit(0);// ==return 
			//return ; //== break 
		}
		
		
		
		
		
		
	}

}
