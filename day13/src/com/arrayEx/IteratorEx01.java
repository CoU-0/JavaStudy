package com.arrayEx;

import java.util.*;
public class IteratorEx01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		ListIterator<String> it = list.listIterator();

		while (it.hasNext()) {
			Object obj = (Object)it.next(); // 순차적으로 안에 있는 데이터를 읽어옴
			System.out.print(obj +"  ");

		}
		System.out.println();

		while (it.hasPrevious()) { //역방향 진행 
			System.out.print(it.previous() + " ");
		}

	}

}
