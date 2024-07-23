package com.objEx;

import java.io.*;

/*
 * 문제]
 * 	 1. 두개의 정수를 입력받아 큰수를  출려하는 기능 
 *  2. 두개의 정수를 입력받아 사이의 합계를 구하는 기능 
 *  3. 세개의 정수를 입력받아 큰수부터 차례로 출력하는 기능 
 *	
 * 
 * 
 */

class Method {

	public static int aaa() throws IOException { // 클래스 명만으로 가능함 static / 객체없이 접근가능
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("첫번째 수 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("두번째 수 : ");
		int b = Integer.parseInt(br.readLine());

		if (a > b) {
			return a;
		} else {
			return b;
		}

	}

	public static void bbb() throws IOException { // 클래스 명만으로 가능함 static void - 리턴없다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("첫번째 수 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("두번째 수 : ");
		int b = Integer.parseInt(br.readLine());

		int sum = 0;
		if (a > b) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;

		}
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(a + " ~" + b + "사이의 합계는" + sum);
		return;

	}

	public static String ccc(int x, int y, int z) { // 클래스 명만으로 가능함 static

		if (y >= x && y >= z) {
			int temp = x;
			x = y;
			y = temp;

		} else if (z >= x && z >= y) {
			int temp = x;
			x = z;
			z = temp;

		}
		if (z >= y) {
			int temp = y;
			y = z;
			z = temp;

		}
		String abc = x + ">=" + y + ">=" + z;
		return abc;

	}

}

public class MethodEx02 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = 0;

		while (true) {
			System.out.print("1 : 최대값 2 : 사이합 3 : 큰수 나열 4 :종료  = >");
			x = Integer.parseInt(br.readLine());

			switch (x) {
			case 1:
				int k = Method.aaa(); // 스태틱 - 객체 생성 필요 없음
				System.out.println("두 정수 중 최대값은 " + k + "입니다.");
				break;

			case 2:
				Method.bbb();
			case 3:
				System.out.println("첫번째 수 : ");
				int a = Integer.parseInt(br.readLine());
				System.out.println("두번째 수 : ");
				int b = Integer.parseInt(br.readLine());
				System.out.println("세번째 수 : ");
				int c = Integer.parseInt(br.readLine());
				
				String str = Method.ccc(a, b, c);
				System.out.println("큰 순으로 나열 "+str);
				break;
						
				
				
				
				
			case 4:
				System.out.println("종료한다.");
				return;

			default:
				System.out.println(" 메뉴 잘못 입력했다.");
				break;
			}

		}

	}

}
