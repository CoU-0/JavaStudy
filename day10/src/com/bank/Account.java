package com.bank;



public class Account {// 계좌
	private String name;//예금주
	private long balance;//잔액 
	
	
	public Account() { // 이게 생략이 가능함 --> 굳이 안써도 됨 
		
	}
	public Account(String name) { // Account 이거부터 시작해도 됨 
		this.name = name; // 초기화 하는 이유?  // 이건 왜 오버로딩 안불러옴 ?
	}
	
	public String getName() {
		return name;
	}
	
	public long getBalance() {
		return balance;
	}
	
	//입금
	public void deposit(long amount) {
		balance += amount; //입금 
	}
	
	
	//출금 
	public void withdraw (long amount) {
		if (balance <amount ) {
			System.out.println("잔액이 부족합니다");
		}else {
			balance -= amount; // 그렇지 않으면 계좌에서 어카운트 만큼 뺌 
		}
		
	}
	
	
}
