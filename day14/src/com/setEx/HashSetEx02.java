package com.setEx;


import java.util.*;
public class HashSetEx02 {

	public static void main(String[] args) {
		HashSet SetA = new HashSet();
		HashSet setB = new HashSet();	
		HashSet setHub = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
	
		SetA.add("1");SetA.add("2");SetA.add("3");SetA.add("4");SetA.add("5");
		System.out.println("A : "+SetA);
		setB.add("4");setB.add("5");setB.add("6");setB.add("7");setB.add("8");
		System.out.println("B : "+setB);
		// A U B 합집합  1~8
		// A ∩ B 교집합 4 5
		// A - B : 123 
		
		Iterator it = setB.iterator();
		while (it.hasNext()) {
			Object tmp = it.next();
			if(SetA.contains(tmp)) // 포함되어있냐는 의미임 // SetA 에 setb의 요소가 포함되어 있으면
				setKyo.add(tmp); // 아래에 kyo에 추가해라 
				
		}
		
		it =SetA.iterator();
		while (it.hasNext()) {
			Object tmp = it.next();
		if ( !setB.contains(tmp))
			setCha.add(tmp);
		}
		
		it = SetA.iterator();
		while ( it.hasNext()) {
			setHub.add(it.next());
			
			
		}
		
		it = setB.iterator();
		while ( it.hasNext()) {
			setHub.add(it.next());
		}
		
		System.out.println("교집합 : " +setKyo);
		System.out.println("합집합 : " +setHub);
		System.out.println("차집합 : " +setCha);
		
		
		
		
		
		
		
		
		
		
		
	}
	}

