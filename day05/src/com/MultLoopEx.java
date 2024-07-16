package com;

import java.io.*;



/*
 * 정수를 입력받아 입력받은수까지 합계를 구하되,
 * 계속 진행할 것인지를 물어보고 y/n으로 정한다.
 *  y가 입력되면 진행, n이 입력되면 stop 
 *  단, 정수의 입력 범위는 1 ~ 1000
 * 
 * 
 */




public class MultLoopEx  {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n ;
		int sum =0;
		char ch; // y/n 값 출력하려고 입력 
		
		while (true) {
			// 입력범위 
			do {
				System.out.print("정수 입력 : ");
				n = Integer.parseInt(br.readLine());
			}while (n<1 || n>1000);  // 계속 범위가 입력 받을 수 있도록 
			
			//1부터 입력받은 정수까지의 합계 
			for (int i= 1; i<n; i++) {
				sum +=i;
			}
			System.out.println("1 ~"+ n+ "까지의 합계 :"+sum);
			System.out.println("계속 진행하시겠습니까[y/n] : ");
			ch = (char)System.in.read();
			
			if ( ch !='y' && ch !='Y') 
				break;
				System.in.read();
				System.in.read();
			
		} // System.out.print("정수를 입력하세요");
		
		
	}

}
