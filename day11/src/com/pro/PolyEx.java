package com.pro;

public class PolyEx {

	public static void main(String[] args) {

		buyer b = new buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
				
		/*
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		*/
		b.buy(audio);
		b.buy(com);
		b.buy(tv);
		b.summary();
		System.out.println();
		b.refund(audio);
		b.summary();
		
		
		//b.refund(new Audio());
		/*
		System.out.println("현재 남은 돈은 "+b.money+"만원 입니다.");
		System.out.println("현재 포인트 점수는 "+b.bounsPoint+"점 입니다.");
		*/
	}

}
