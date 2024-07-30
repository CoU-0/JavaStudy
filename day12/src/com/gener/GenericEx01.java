package com.gener;


class Box<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
public class GenericEx01 {

	public static void main(String[] args) {
	Box<Integer>bi= new Box<Integer>();
	bi.setT(10);

	bi.setT(new Integer(20));
	Integer i= bi.getT();
	System.out.println(i);
	
	Box<String>bs= new Box<>();
	bs.setT("Java");
	String s=bs.getT();
	System.out.println(s);

	}

}
