package com.arrayEx;

import java.util.*;

class MyVector extends Vector {

	public MyVector() {
		super(1, 1);

	}

	public void addInt(int i) { //
		addElement(new Integer(i));

	}

	public void addfloat(float f) { //
		addElement(new Float(f));

	}
	public void addString(String s) { // 
		addElement(s); // 스트링이 객체이기 때문에 그냥 s만 넣어도 오케이 
		
}
	public void addCharArray(char[] a) { // 
		addElement(a);
		
}
	public void write() {
		Object o;
		int length = size();
		
		for(int i = 0; i <length; i++) {
			o = elementAt(i);
			if(o instanceof char[]) {
				System.out.println(String.copyValueOf((char[])o));
			}else {
				System.out.println(o.toString());
			}
		}
		
	}
}

public class VectorEx03 {

	public static void main(String[] args) {
		MyVector v = new MyVector();
		
		int digit = 5;
		float real =3.14f;
		char letters[] = {'J','A','V','A'};
		String s= new String("Good Programming");
		
		v.addInt(digit);
		v.addfloat(real);
		v.addString(s);
		v.addCharArray(letters);
		v.write();
		
		
		
	}

}
