package com.Sungjuck;

public class CardEx {

	public static void main(String[] args) {
		Card c = new Card(); //객체 생성 완료 
		//c.~ 이런식으로 객체를 가져올 수 있음 static이 아니라면 이런식으로 가져옴 
		System.out.println("Card.width" + "Card.height");
		System.out.println("Card.height"+"Card.width");
		// 클래스 변수는 (static 변수)는 객체 생성없이
		// 클래스이름. 클래스변수명으로 직접 사용이 가능하다. 
		
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 10;
		// 인스턴스 변수의 값을 변경 
		
		System.out.println("c1은 " +c1.kind+","+c1.number+"이며, 크기는 "
				+ "("+c1.width+","+c1.height+")");
		
		System.out.println("c2는 " +c2.kind+","+c2.number+"이며, 크기는 "
				+ "("+c2.width+","+c2.height+")");
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경하시오.");
		// 크기 변경 -> 이미 클래스 변수에 갑이 있는데 이를 변화 시키기 위한 방법  
		c1.width = 50;
		c1.height =80; 
		// c1과 c2의 값이 전부바뀜

		System.out.println("c1은 " +c1.kind+","+c1.number+"이며, 크기는 "
				+ "("+c1.width+","+c1.height+")");
		
		System.out.println("c2는 " +c2.kind+","+c2.number+"이며, 크기는 "
				+ "("+c2.width+","+c2.height+")");
		
		// -> c2까지 전부 바뀜 왜? 
		// 각 카드의 폭과 높이는 모든 인스턴스가 공통적으로 같은 값을 유지해야 함으로 클래스 변수로 선언 
		// 그래서 카드의 폭의 변경해야할 필요가 있을 경우, 모든 카드의 폭 값을 변경하지 않고 한 카드의 폭만
		// 변경해도 모든 카드의 폭값이 변경되게 됨
		
		
		
		
		
		
		
	}

}
