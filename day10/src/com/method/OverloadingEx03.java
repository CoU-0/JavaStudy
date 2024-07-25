package com.method;

/*
 * 오버로딩을 사용해서 사각형 넓이를 구현하는 프로그램 
 */

public class OverloadingEx03 {
	// 사각형의 넓이
	public int area(int w, int h) {
		return w * h;

	}

	public double area(int r) {
		return (double) (r * r * 3.141592);

	}

	public void writer(int result) {
		System.out.println("사각형의 넓이 :" + result);
	}

	public void writer(double result) {
		System.out.println("원의 넓이  :" + result);
	}

	public static void main(String[] args) {
		OverloadingEx03 oo = new OverloadingEx03();
		int r = oo.area(10, 5);
		double c = oo.area(5);

		oo.writer(r);
		oo.writer(c);

	}

}
