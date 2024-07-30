package com.starex;

public class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		
		System.out.println("Take it slow, Dropship=>x:"+x+",y:"+y);
		
	}

	@Override
	void stop() {
		System.out.println("In the by, by, by~~~");
		
	}

	@Override
	void message() {
		
	System.out.println("Message: Can I take orders.");
	
		
	}

}
