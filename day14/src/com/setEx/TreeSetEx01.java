package com.setEx;

import java.util.*;

public class TreeSetEx01 {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		
		String from = "b"; // 범위의 시작 ~로부터 
		String to = "d";  // ~ 까지, 범위의 끝 
	
		set.add("abc");set.add("alien");set.add("bat");set.add("car");set.add("disc");
		set.add("dance");set.add("dZZZ");set.add("dzzz");set.add("elephant");set.add("elevator");
		set.add("fan");set.add("flower");
		System.out.println(set);
		System.out.println("범위 검색 : from "+ from+" to "+to);
		System.out.println("범위 결과 :" + set.subSet(from, to));
		System.out.println("범위 결과 :" + set.subSet(from, to+"zzz"));
	
		
	}

}
