package com.method;



public class OverloadingEx02 {

	public void getLength(int n) {
		String s = String.valueOf(n);
		getLength(s);
		
		
	}
	
	public void getLength(float n) {
		String s = String.valueOf(n);
		
		
	}
	
	private int getLength(String str) {
	System.out.println("입력한 값의 길이 : " + str.length());
	return 1;  // 값이 있기 때문에 값을 돌려줘야ㅎㅁ
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingEx02 oe = new OverloadingEx02();
		oe.getLength(1000);
		// new OverloadingEx02().getLength(1000);
		
		oe.getLength(3.14f);
		oe.getLength("10000");
	}

}
