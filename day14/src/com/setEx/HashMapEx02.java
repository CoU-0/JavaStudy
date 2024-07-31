package com.setEx;
import java.util.*;


public class HashMapEx02 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("가길동", new Integer(90));
		map.put("나길동", new Integer(100));		
		map.put("다길동", new Integer(60));
		map.put("라길동", new Integer(100));
	
		System.out.println(map);
		
		// set 으로 먼저 키값을 취득한 다음에 set에 저장 - > set 이 가지고 있는 iterator로 값을 취득한다. 
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		
		while (it1.hasNext() )  {  //이걸로 값을 얻어옴 
			 Map.Entry<String, Integer> e = it1.next();
		System.out.println("이름 : " + e.getKey()+" 점수 : " +e.getValue());
		
		}
		Set set2 = map.keySet();
		System.out.println(" 이름 :" + set2); // 키 값만 -> 이름
		
		// 값을 컬레션으로 저장함 
		Collection<Integer> v = map.values();
		Iterator<Integer> it2 = v.iterator();
		
		int sum = 0 ;
		while(it2.hasNext()) {
			Integer i = it2.next();
			sum += i;
			
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : "+ (float)sum/set2.size());
		System.out.println("최고점수 "+ Collections.max(v));
		System.out.println("최저점수 "+ Collections.min(v));

	}

}
