package com.gener;

import java.util.*;

public class StackEx01 {

	private static final String Colors[] = { "검정", "노랑", "녹색", "청색", "빨강", "연두색" };

	public StackEx01() {
		Stack<String> st = new Stack<String>();
		for (String color : Colors) {
			st.push(color);// 스택에 저장
		}
		popStack(st);
	}

	public void popStack(Stack<String> st) {
		System.out.println("pop:");
		while (!st.empty()) {// 스택이 비어있지 않으면
			System.out.println(st.pop());// 출력
		}
	}

	public static void main(String[] args) {

		new StackEx01();

	}

}
