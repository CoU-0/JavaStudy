package com.objEx;

/*
 *		char [] 배열을 인자로 전달받아 출력하는 PrintCharArray() 메소드의
 *		배열속의 공백('')문자를','로 대치하는 replaceSpace() 메소드를 구현하라.
 * 
 */

public class ArrayMethodEx {

	public static void replaceSpace(char[] a) { // 공백문자를 ","로 바꿀때 사용하는 메소드
		
		for (int i = 0; i < a.length; i++) {
			// 공백 문자를 ,로 바꾸는 과정 
			if (a[i]==' ') {
				a[i] = ',';
			}
			
		}
		
	}

	public static void PrintCharArray(char [] a) { // char[] 캐릭터배열을 출력메소드 
		// char []배열을 인자로 전달받아 출력 
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	
	
	}

	public static void main(String[] args) {
		   // 이것은 연필입니다. 
		   char[]c = {'T','h','i','s',' ', 'i' ,'s', ' ', 'a',' ', 'p','e','n','c','i','l','.'} ;  // 케릭터임 
		   // 전체 배열에 저장된 값을 출력한다. 
		PrintCharArray(c);
		
		replaceSpace(c); // 변경 
		PrintCharArray(c);// 변경 후 출력 
	
	}

}
