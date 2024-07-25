package com.CardEx;

public class DeckEx {

	public static void main(String[] args) {
		Deck d = new Deck(); // 카드 한벌을 만든다.
		Card c = d.pick(0); // 섞기전에 제일 위에 있는 카드를 볶는다.
		System.out.println(c);
		
		// 카드를 섞는다.
		d.Shuffle();
		c = d.pick(0);
		System.out.println(c); // 섞은 후 
		
	}

}
