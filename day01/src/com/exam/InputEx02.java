package com.exam;

//문자 입력받기 
import java.io.*;
public class InputEx02 {

	public static void main(String[] args) throws IOException {
		
		
		System.out.print("문자입력 :"); // 문자가 아무리 많아도 문자 하나만 가져옴 --> 문자를 입력받는다고 말함 
		char i =(char)System.in.read();
		
		System.out.println("입력받은 문자 : "+i);
		
		
		
	}

}
