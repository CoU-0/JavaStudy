package com.objcex;



class Parent{
	
	public Parent (int x) {
		System.out.println("부모 생성자의 클래스 :" +x);
	}
}

class Child extends Parent {
	
	public Child() {
		super(5);
		System.out.println("자식 하위 클래스 생성자 "); //
	}
	
}




public class SuperEx01 {

	public static void main(String[] args) {
		Child c = new Child();
		
		
		
		
		
		
		
	}

}
