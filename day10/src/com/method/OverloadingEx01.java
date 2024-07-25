package com.method;

public class OverloadingEx01 {

public void intLength(int a) {
String s = String.valueOf(a); //안에 있는 문자를변환하는방법 / 문자열을가지고 활용하는 방법 

System.out.println("입력한 값의 길이 :" +s.length());
}

public void floatLength(float f) {
String s = String.valueOf(f); //안에 있는 문자를변환하는방법 / 문자열을가지고 활용하는 방법 

System.out.println("입력한 값의 길이 :" +s.length());
}

public void StringLength(String str) {

System.out.println("입력한 값의 길이 :" +str.length());
}



/*
 * length :  문자열 길이 
 * length() : 문자열의 길이  
 * 
 */




	
public static void main(String[] args) {
	
	OverloadingEx01 oe = new  OverloadingEx01();
	oe.intLength(1000);
	oe.floatLength(3.14f);
	oe.StringLength("10000");	
	
	}

}
