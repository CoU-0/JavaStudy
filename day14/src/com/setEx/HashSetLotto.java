package com.setEx;

import java.util.*;


public class HashSetLotto {

	public static void main(String[] args) {
		Set set = new HashSet();
		//Set<Integer> set = new HashSet();
		
		for(int i = 0; set.size()<6 ;i++) {
			int num = (int)(Math.random()*45)+1; // 0번부터 시작 - 1부터 시작할 수 있도록
			set.add(new Integer(num));
		
		}
		
		//System.out.println(set);
	 System.out.println(set);
	 System.out.println();
	List list = new LinkedList(set);
	 Collections.sort(list);
	 System.out.println(list);
	}

}
