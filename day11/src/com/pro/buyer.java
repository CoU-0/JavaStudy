package com.pro;

import java.util.*;

public class buyer {

	int money = 10000;
	int bounsPoint = 0;
/*
	// 구입한 제품을 저장하기 위한 객체 배열
	Product[] item = new Product[10];
	int i = 0; // 배열에 사용할 변수
*/
	// 구입한 제품을 벡터에 저장함 
	Vector item = new Vector();
	
	
	void buy(Product p) {// 부모를 이용해 매개변수로 - 매개변수의 다형성
		if (money < p.price) {
			System.out.println("잔액이 부족하여 구매할 수 없다^^");
			return;
		}

		money -= p.price; // 소유 금액에서 제품을 구매한 만큼 차감
		bounsPoint += p.bonusPoint;// 제품의 포인트 점수를 추가한다.
		//item[i++] = p; // 제품을 product[] item에 저장한다.
		item.add(p); // 구입한 제품을 벡터에다가 저장 
		System.out.println(p + "을 구입하셨습니다.");
	}
		// 구입한 제품을 환불하는 기능 
		void refund(Product p) {
			if(item.remove(p)) { // 벡터에 저장된 제품을 제거한다.
				money += p.price;
				bounsPoint -=p.bonusPoint;
				System.out.println(p+"을 환불하셨습니다.");
			}else {
				System.out.println("구입하신 제품중에는 반품하실 제품이 존재하지 않습니다.");
			}
		}
	
	
	// 구매한 제품의 정보를 입력
	void summary() {
		int sum = 0; // 구입한 제품의 합계
		String itemList = ""; // 구입한 제품 목록
		
		
		//Vector 가 비어있는지를 확인해야함 
		if(item.isEmpty()) { // true 가 나오면 비어있다는의미의 매소드 
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
			for(int i = 0; i < item.size(); i++) {
				Product p = (Product)item.get(i);
				
					sum += p.price;
					itemList += (i==0)?" "+p : ","+p;  //삼항 연산자
			}
			
			
		
		/*
		// 반복문을 이용해 구입한 제품을 총 가격과 목록을 만듦 
		for(int i = 0; i < item.length; i++) {
			if (item[i] == null) 
				break;
				sum += item[i].price;
				itemList += item[i] +",";
		}
		*/
		System.out.println("제품 구입 총금액" + sum + "만원입니다.");
		System.out.println("구입한 제품은 "+itemList+"입니다.");
	}

}