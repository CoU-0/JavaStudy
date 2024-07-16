package com.loopEx;

import java.util.*;

public class ForExam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		int a, b;
		System.out.print("숫자 입력 : ");
		n = sc.nextInt();// 3 / 5

		for (a = 2; a <= 9; a += n) {

			for (b = 1; b <= 9; b++) { //2 

				for (int k = a; k < a+n; k++) {
					System.out.print(k + "*" + b + "=" + (k * b) + "\t");
					
				}
				System.out.println();

			}
			System.out.println();

		}

	}

}
