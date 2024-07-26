package com.updown;

public class CastingEx01 {

	public static void main(String[] args) {

		Car car =null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		// car.water(); // car 타입의 참조변수로는 water() 매소드를 호출할 수 없습니다.
		fe = (FireEngine)car;
		fe.water(); // 다운 캐스팅 
	}

}
