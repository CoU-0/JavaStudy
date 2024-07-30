package com.arrayEx;

import java.util.*;


public class ExamArrayToString {

	public static void main(String[] args) {
		List<String> mList = new ArrayList<String>();
		mList.add("1");
		mList.add("2");
		mList.add("3");
		
		
		//List --> String 문자열 배열로 만듦 
		String[] sArrays = mList.toArray(new String[mList.size()]); 
		
		for(String s : sArrays) {
			System.out.println(s);
		}
		
		// String [] --> List 로 문자열을 list로 
		ArrayList<String> mNewList = new ArrayList<String>(Arrays.asList(sArrays)); //asList를 이용해서 string 를 list로 바꿈 
		for (String s : mNewList) {
			System.out.println(s);
		}
		
	}

}
