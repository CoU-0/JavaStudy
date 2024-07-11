package com02;

import java.io.*;

public class IfEx05 {

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

		if (op == '+') {
			System.out.printf("%d %c %d = %d", n, op, m, (n + m));

		} else if (op == '-') {
			System.out.printf("%d %c %d = %d", n, op, m, (n - m));

		} else if (op == '*') {
			System.out.printf("%d %c %d = %d", n, op, m, (n * m));

		} else if (op == '/') {
			System.out.printf("%d %c %d = %d", n, op, m, (n / m));

		} else {
			System.out.println("연산자를 넣어주세요");
          
		}

	}

}
