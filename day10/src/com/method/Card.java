package com.method;

import java.security.PublicKey;

public class Card {
	int a; 
	int b;
	String s;
	
	
public Card(){
		this.a = 10;
		this.b = 20;
	}
	
public Card(int a ){
	this.a = 10;
	this.b = 20;
	
}


	public Card(int a, int b, String c ){
		this.a =a;
		this.b =b;
		this.s =s;
}

	public static void main(String[] args) {
		Card c = new Card();
		Card c1 = new Card(10);
		//Card c2 = new Card(10, 20);
		Card c3 = new Card(10, 20, "java");
		
		System.out.println(c.a+","+c.b+","+c.s);
		
		
		
	}

}
