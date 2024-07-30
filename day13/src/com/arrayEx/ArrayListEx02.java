package com.arrayEx;
import java.util.*;


public class ArrayListEx02 {

	public static void main(String[] args) {

		final int LIMIT = 10; // 자르고자하는 글자의 개수를 지정 
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length(); // 정수형으로 저장 
		
		List list = new ArrayList(length/LIMIT+10); // 원래 10인데 추가 
		
		for(int i = 0 ; i <length; i+=LIMIT) {
			if (i+LIMIT <length) {
				list.add(source.substring(i, i+LIMIT)); // 더 많은 객체가 들어오면 자동으로 공간 늘리는 장치 
			}else {
				list.add(source.substring(i));
			}
		}
		
		// 출력 
		for(int i = 0; i <list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//문자열 데이터를 원하는 길이로 잘라서 List에 저장하는 방법 
		// subString () -> 문자열을 부분적으로 잘라서 저장 // 부분함수라 부분적으로 잘라 가져다가 사용하는 함수라고 생각하면됨 
		// i ~ 10개 정도의 크기까지 고려해서 잘라서 
		
		
	}

}
