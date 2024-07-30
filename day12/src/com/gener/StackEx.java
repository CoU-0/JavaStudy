package com.gener;
/*
 * Stack 
 *	 		-Stack은 객체를 후입선출방식(LIFO)을 이용하며 객체의 저장시 push(), 
 * 			출력시의 pop() 메소드 사용, 객체의 가장 위쪽의 peek() 메소드, 
 *	 		스택이 비었는지를 판별해주는 empty() 와 검색해주는 search () 메소드를 가지고 있음
 *  
 */

import java.util.*;
public class StackEx {

	public static void main(String[] args) {
	
		String []groupA= {"우즈베키스탄","쿠웨이트","사우디","대한민국"};
		
		
		Stack<String>st=new Stack<String>();
		for(String n:groupA)
			st.push(n);// 스택에 저장
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
		
		
		
	}

}
