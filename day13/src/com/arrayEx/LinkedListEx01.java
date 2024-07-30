package com.arrayEx;

import java.util.*;

public class LinkedListEx01 {
	private static final String colors1[] = { "검정", "노랑", "녹색", "파랑", "주황", "연두" };

	private static final String colors2[] = { "초록", "빨강", "흰색", "남색", "보라색" };

	public LinkedListEx01() {

		List<String> list1 = new LinkedList<>(); // 컬러1 을 넣음
		List<String> list2 = new LinkedList<>();// 컬러 2를 넣음

		for (String color : colors1)
			list1.add(color);

		for (String color : colors2)
			list2.add(color);

		list1.addAll(list2);
		list2 = null;

		System.out.println(list1);
		System.out.println(list2);
		printList(list1);
		
		System.out.println("\n 4에서 6까지 요소 삭제....");
		removeItems(list1, 4, 7);
		printList(list1);
		
		printReversedList(list1); // 역순으로 출력 
	}

	// 출력매소드
	public void printList(List<String> list) {
		System.out.println("\n list : "); // 리스트에서 [] 와 띄어쓰기 빼버림 
		for (String color : list)
			System.out.printf("%4s", color); // 숫자는 간격임 
		System.out.println();

	}

	// 자료 삭제 
	private static void removeItems(List<String> list, int start, int end) {
		list.subList(start, end).clear();
	}
	
	private static void printReversedList(List<String> list) {
		ListIterator<String> it= list.listIterator(list.size());
		System.out.println("\n Reversed List :");
		while(it.hasPrevious()) {
			System.out.printf("%4s",it.previous());
		}
	}
	
	
	public static void main(String[] args) {
		new LinkedListEx01(); // 컬러 1 2 전부 포함된 애들 출력

	}

}
