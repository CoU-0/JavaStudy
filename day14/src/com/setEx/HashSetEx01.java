package com.setEx;

import java.util.*;

public class HashSetEx01 {

	public static void main(String[] args) {
		
		Object[] objArr = {"1",new Integer(1), "2","2","3","3","4","4","4"};		
		//1- > String / integer = 숫자임 
		// set - 중복된 데이터는 허용하지 않음.
		//add - 추가 매소드 
		
		Set set =new HashSet(); // set은 인터페이스 이기 때문에 객체 생성이 안돼 -> HashSet가져옴 
		// set 컬렉션 데이터를 추가 objArr 배열에 저장된 데이터를 추가 
		for (int i = 0; i <objArr.length; i++) {
			set.add(objArr[i]); // set에  objArr의 데이터를 저장한다.
		}
		//System.out.println(set);
		
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		
		
		
	}

}
