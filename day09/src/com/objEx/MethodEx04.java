package com.objEx;

import java.io.*;

public class MethodEx04 {

	public static String getString(String str) throws IOException { // 메소드 호출할때 인자값으로 넘겨준다 이런ㄷ뜻?
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(str + " ");
		String ss = br.readLine();
				return ss ;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		String name = getString("이름");
		System.out.println(name + "님 반갑습니다.");
		
		
		
		
		
	}

	
}
