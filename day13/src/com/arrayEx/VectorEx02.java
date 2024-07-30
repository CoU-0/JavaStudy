package com.arrayEx;

import java.util.*; // 벡터를 쓰기 위해서는 유틸을 써야함 

public class VectorEx02 {

	private static final String colors[] = { "검정", "노랑", "녹색", "파랑", "주황", "연두" };

	public static void main(String[] args) {

		int i;
		String str;
		Vector v = new Vector();

		for (i = 0; i < colors.length; i++)
			v.add(colors[i]);

		str = (String) v.firstElement(); // 첫번째 값
		System.out.println("첫번째 요소" + str);

		str = (String) v.get(1);
		System.out.println("두번째 요소" + str);
		
		str = (String) v.lastElement(); // 첫번째 값
		System.out.println("마지막 요소" + str);

		System.out.println("\n 전체 요소 출력");
		
		Iterator it = v.iterator();
		
		while(it.hasNext()) {
			str = (String)it.next();
			System.out.print(str+" ");
		}
		
	}

}
