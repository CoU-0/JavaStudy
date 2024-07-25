package com.CardEx;

public class Card {

	// 카드 무늬
	static final int KIND_MAX = 4; // 고정을 의미하는 키워드

	// 무늬별 카드 수(종류별 카드수 )
	static final int NUM_MAX = 13;

	static final int SPADE = 4;
	static final int DIAMOND = 4;
	static final int HEART = 4;
	static final int CLOVER = 4;

	int kind;
	int number;

	public Card() {
		this(SPADE, 1);
	}

	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		
		String [] kinds = {"", "ClOVER","HEART","DIAMOND","SPADE"};
		String numbers = "0123456789XJQK";
				
		
		return "kind : " +kinds[this.kind]+",number :" + numbers.charAt(this.number);
	
	}

}
