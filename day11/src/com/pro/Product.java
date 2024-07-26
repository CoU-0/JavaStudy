package com.pro;

public class Product {

	int price; // 가격
	int bonusPoint; // 제품 구매시 증정되는 포인트 점수

	
public Product() {
	price = 0 ;
	bonusPoint = 0;


}
	
	
	public Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10); // 포인트 점수는 제품가격의 10%로 활용
	}
}
