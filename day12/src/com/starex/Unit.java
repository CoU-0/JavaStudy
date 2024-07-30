package com.starex;

public abstract class Unit {//  추상 클래스
	
	int x,y; // 위치 좌표 변수
	
	abstract void move(int x, int y);
	abstract void stop ();
	abstract void message ();
	
	
	

}
