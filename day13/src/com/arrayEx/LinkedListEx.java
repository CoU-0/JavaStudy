package com.arrayEx;

import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {
		String[] item = {"소나타","렉스톤","제규어"};
		
		LinkedList<String> a = new LinkedList<>();
		for(String n : item)
			a.offer(n); // 요소 추가 
		
		System.out.println("a의 크기는 : "+a.size());
		
		String data = ",";
		while((data = a.poll()) != null) { // 제거할때는 poll이라는 매소드 사용 
			System.out.println(data+"삭제");
		}
		
		
	}

}
