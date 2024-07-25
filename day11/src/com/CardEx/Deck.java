package com.CardEx;

public class Deck {

	final int CARD_NUM = 52; // 카드의 개수
	Card cardArr[] = new Card[CARD_NUM]; // Card 객체배열

	public Deck() {// deck를 초기화 한다.
		int i = 0;
		for (int k = Card.KIND_MAX; k > 0; k--) {
			for (int n = 0; n < Card.NUM_MAX; n++) {
				cardArr[i++] = new Card(k, n + 1);
			}
		}
	}
	Card pick(int index) { // 지정된 위치에 있는 카드를 하나씩 꺼내서 반환하는 
		return cardArr[index];
	}
	Card pick() { // 덱에서 카드 하나를 선택할때 
		int index =(int)(Math.random()*CARD_NUM);
		return pick(index); // 하나 선택해서 넘겨줌 
	}
	void Shuffle () { // 카드의 순서를 섞는다.
		for(int i = 0; i <cardArr.length; i++) {
			int r = (int)(Math.random()*CARD_NUM);
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp; // 자리바꾸기 
		}
	}
}
