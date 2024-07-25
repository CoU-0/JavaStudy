package com.objcex;

class Super {
	int a =5;
}

class Sub extends Super{
	int a = 10;


public void display() {
	System.out.println(this.a); // this 자기 자신
	System.out.println(super.a); // 부모를 가르킴
}
}
public class SuperEx {

	public static void main(String[] args) {
		//Sub s =new Sub();
		 new Sub().display();

		
	}

}
