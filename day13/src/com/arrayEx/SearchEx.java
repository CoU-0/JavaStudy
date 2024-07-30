package com.arrayEx;

import java.util.*;
import java.io.*;


public class SearchEx {

	
	public static void main(String[] args)  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<String> lists = new ArrayList<>();
		lists.add("우리나라");
		lists.add("우산");
		lists.add("우리은행");
		lists.add("대한민국");
		lists.add("대한제국");
		lists.add("대구");
		lists.add("대형마트");
		lists.add("자바");
		lists.add("자연");
		
		String str;
		
		try {
		System.out.print("검색할 단어 : ");
		str = br.readLine();
		ListIterator<String> it = lists.listIterator();
		
		while(it.hasNext()) {
			String temp = it.next();    // 요소값 존재하면 temp  저장 
			if(temp.startsWith(str)) {   // 문자열 비교는 equals   // 첫글자도 비교해도 검색될 수 있도록
			System.out.println(temp); // 첫글자 비교해서 출력 
		}
		
		}
		
	}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

