package com.setEx;

import java.util.*;
public class TreeMapEx01 {

	public static void main(String[] args) {
		// 맵은 인터페이스이기 떄문에 Hashmap에 의해 객체 생성 
		TreeMap<String, String> map = new TreeMap<>();
		map.put("만화","마녀 배달부 키키" );  // key 
		map.put("호러","스크림" ); 
		map.put("영화","황혼에서 새벽까지" );	
		map.put("방화","쉬리");
		map.put("TV", "X-Files");
		
		Map<String, String> subMap = map.subMap("방화", "호러");
		System.out.println();
		
	
	}

}
