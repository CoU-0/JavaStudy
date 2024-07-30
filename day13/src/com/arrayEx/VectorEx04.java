package com.arrayEx;

import java.util.*;


public class VectorEx04 {

	private static final String colors[] = { "검정", "노랑", "녹색", "파랑", "주황", "연두" };

	
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		for(String str : colors)
			v.add(str);
		System.out.println("첫번째 요소 : "+v.firstElement());
		System.out.println("두번째 요소 : "+v.get(1));		
		System.out.println("세번째 요소 : "+v.lastElement());
		
		//데이터 변경(수정)
		v.set(0, "흰색");
		System.out.println("첫번째 요소 :" +v.firstElement());
		System.out.println("요소 갯수 :" +v.size());
		
	
		//첫번째 요소에 빨간색 추가 
		v.insertElementAt("빨강", 0);
		System.out.println("첫번째 요소 :" +v.firstElement());
		System.out.println("요소 갯수 :" +v.size());
		
		//전체 출력 
		System.out.println("\n 전체출력 : ");
		for(String str : v) {
			System.out.println(str + " ");
		}
		System.out.println();
		
		//오름차순 정렬 
		Collections.sort(v);
		System.out.println("오름 차순 정렬 후 : ");
		for(String str : v) {
			System.out.print(str +" ");
		}
		System.out.println();
		
		
		String s = "노랑";
		if(v.contains(s)) {
			int i = v.indexOf(s) +1; // 인덱스 0번부터 시작이니 +1 
			System.out.println(s+"의 위치는 : "+i);
		}
		
		//삭제
		v.remove(0);
		v.remove("파랑"); // 지워버리면 아래 데이터 찾을 수 없음  
		
		
		
		// 검색 : 오름차순 정렬을 수행 후 저렬된 자료에서만 사용이 가능함 
		int idx = Collections.binarySearch(v,"파랑"); // 몇번째 위치에 있는지 찾아서 출력해줌 
		System.out.println("\n 파랑 : "+idx +"index에 위치");
		//-> 찾고자 하는 자료가 없으면 음수를 출력함 
		
		// 내림차순 정렬 
		Collections.sort(v,Collections.reverseOrder()); // reversoder -역순으로 하는 메소드 
		System.out.println("내림차순 정렬 후 : ");
		for(String str : v) {
			System.out.print(str +" ");
		}
		System.out.println();
		
		// 내림 차순 정렬 후 자료 검색 
		idx = Collections.binarySearch(v,"파랑",Collections.reverseOrder()); // 오름차순일때랑 다르게 인자값이 하나 더들어감 
		System.out.println("\n 파랑 :" +idx+"index에 위치");
		// 찾고자 하는 데이터가 없을때 음수 표현 
		
		
		
		
	}

}
