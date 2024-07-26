package com.son;

import com.objeEx.shape;

class Person1 {}
class Student1 extends Person1 {}
class Researcher1 extends Person1 {}
class Professor1 extends Person1 {}

public class InstanceOfEx {

	static void print(Person1 p) {
		if ( p instanceof Person1 )
			System.out.println("person");
		if ( p instanceof Student1)
			System.out.println("Student");
		if ( p instanceof Researcher1)
			System.out.println("Researcher");
		if ( p instanceof Professor1)
			System.out.println("Professor");

		System.out.println();
	
	}
	
	
	public static void main(String[] args) {
		System.out.print("new Student() -> ");
		print(new Student1());
		System.out.print("new Researcher() -> ");
		print(new Researcher1());
		System.out.print("new Professor() -> ");
		print(new Professor1());
		
		
	}

}
