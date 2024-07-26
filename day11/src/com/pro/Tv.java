package com.pro;

public class Tv extends Product{

	public Tv () {// Tv 가격을 100만원으로 받음 
		super(100);
	}
	
	@Override
	public String toString() {
		return "Tv";
	}
	
	
}
