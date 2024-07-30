package com.arrayEx;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx01 {
	
	static void print(ArrayList list1, ArrayList list2) { // list 1 list 2의 인자값을 가지고 가겠다
		System.out.println("list1 : " +list1);
		System.out.println("list2 : " +list2);		
		System.out.println();
		
	}
	
	public static void main(String[] args) { //integer = 객체형만 들어올 수 있다. 
	//ArrayList<Integer> list1 = new ArrayList<>(10); // 크기 지정 가능  10개의 데이터를 저장할 수있는 리스트를 만든것 
	ArrayList list1 = new ArrayList<>(10); // arraylist - 똑같은 객체를 담는것이기 떄문에 숫자 문자로 보는것이아닌 객체로 봄 - 동일하게 저장됨 
	list1. add (new Integer(5)); // 오류는 아니지만 경고 인덱스 0
	list1. add (new Integer(4));
	list1. add (new Integer(2));
	list1. add (new Integer(0));
	list1. add (new Integer(1));
	list1. add (new Integer(3));

	ArrayList list2 = new ArrayList(list1.subList(1,4)); // 1번째부터 4번째까지 리스트를 만들 수 있다. 
	
	System.out.println("정렬전 =====");
	print(list1, list2);
	
	Collections.sort(list1); // 오름차순 정렬 
	Collections.sort(list2); //
	System.out.println("정렬후  =====");
	print(list1, list2);
	
	System.out.println("list1.containsAll(list2) "+list1.containsAll(list2)); // 포함된 요소가 있는지 없는지 확인하는 메소드 
	
	list2.add("B");
	list2.add("C");
	list2.add(3,"A");
	print(list1, list2);
	
	list2.set(3, "AA");  // -> 3,A 가 위에 존재함. --> 값이 바뀜 - set - 안에 있는 내용을 다시 설정할떄 사용하는 매소드임 .
	print(list1, list2); // 인덱스 3번째 위치에 있는 3에다가 새로운값을 저장하겠다 --> set
	
	//겹치는 부분만 뽑고싶을때 
	// list1 에서 list2와 겹치는 부분만 빼고 남기고 나머지는 삭제처리 
	System.out.println("list1.retainAll(list2) " + list1.retainAll(list2)); 
	// retainAll : list2 와 list2 와 공통적인 부분 이외에 모두 삭제처리 
	
	print(list1, list2);

	// list2에서 list1에 포함된 객체들을 삭제할때 remove 
	for (int i= list2.size()-1;i>=0;i--) {
		if (list1.contains(list2.get(i)));
			list2.remove(i);

	}
	print(list1,list2);
	
	
	}

}
