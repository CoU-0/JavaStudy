package com.arrayEx;

import java.util.*;

class MyData{
	
	public String name;
	public int age; 
	
	public MyData() {
		name = "";
		age = 0;
	}

public MyData (String name, int age) {
	this.name = name;
	this.age=age;
}
	

}


public class VectorEx05 {


	
	public static void main(String[] args) {

		Vector<MyData> v = new Vector<MyData>();
		v.add(new MyData("가길동", 23));
		v.add(new MyData("나길동", 24));
		v.add(new MyData("다길동", 25));
		
		for(MyData ob : v) {
			System.out.printf("이름 : %s, 나이 : %d\n ",ob.name, ob.age);
		}
		
	}

}
