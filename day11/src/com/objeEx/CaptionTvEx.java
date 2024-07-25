package com.objeEx;

public class CaptionTvEx {

	public static void main(String[] args) { // tv 클래스를 상속받은 자식을 호출 
		 CaptionTv ctv = new CaptionTv();
		ctv.channel = 10 ; // 부모의 클래스로부터 상속받은맴버 필드임 
		ctv.channelUp();  // 부모의 클래스로부터 상속받은맴버 필드임 
		
		System.out.println(ctv.channel);
		
		ctv.displayCation("안녕하세요. 여러분 "); // off 일 때 
		// 캡션의 기능을 온 한다.  on = true와 같다.
		ctv.caption=true;
		ctv.displayCation("안녕하세요. 여러분 "); // on 상태일 때 
		
		
	}

}
