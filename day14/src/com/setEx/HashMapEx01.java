package com.setEx;
import java.util.*;


public class HashMapEx01 {

	public static void main(String[] args) {
		
		//Map <Key, value> 키는 중복을 허용하지 않는다 
		// 만약 Key가 중복될 경우 key값은 변하지 않고 값이 변화한다. 
		// 맵은 인터페이스이기 떄문에 Hashmap에 의해 객체 생성 
		Map<String, String> map = new HashMap<>();
		map.put("만화","마녀 배달부 키키" );  // key 
		map.put("호러","스크림" ); 
		map.put("영화","황혼에서 새벽까지" );
		
		
		System.out.println(map);
		System.out.println();
		String key;
		Set set = map.keySet(); // 중복 허용안하는 클래스 set 
		Iterator it = set.iterator();
		while (it.hasNext()) {
			key =(String)it.next();
			System.out.println(map.get(key)); // 키 값만 확인 가능 
		}
		System.out.println();
		
		map.put("영화", "달마야 놀자"); //키값이 동일할 경우 값이 바뀐다.
		System.out.println(map);
		
		
		
	}

}
