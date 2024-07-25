package com.objeEx;

public class CaptionTv extends Tv {

	boolean caption; //캡션 상태인 (on / off )
	
	void displayCation(String text) {
		if(caption) { // 캡션 상태가 on인경우 text를 보여주겠다. 
			System.out.println(text);
		}
	}
	
	
	
}
