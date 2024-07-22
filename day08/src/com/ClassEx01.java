package com;

/*
 *	객체 지향 언어는 기존의 프로그래밍 언어와 다른 전혀 새로운 것이 아니라 
 *	기존의 프로그래밍 언어에 몇가지 새로운 규칙을 추가한 보다 나은 형태의 것이다. 
 *	새로운 규칙들을 이용해서 코드 간의 서로 관계를 맺어 줌으로써 보다 유기적으로 프로그램을 
 *	구현하는 것임
 *	 
 * 	객체지향 언어의 주요 특징
 * 1. 코드의 재 사용성 
 * 		- 새로운 코드를 작성할때 기존의 코드를 이용하여 작성할 수 있다. 
 * 2. 코드 관리의 용이성 
 * 		- 코드간의 관계를 이용해 적은 노력으로 쉽게 코드 변경 가능 
 * 3. 신뢰성이 높은 프로그래밍을 가능하게 한다. 
 * 		- 변경제어자와 메소드(매서드)를 이용하여 데이터를 보호하고 올바른 값을 
 * 		  유지하도록 하며, 코드의 중복을 제거하여 코드의 불일치로 인한 오동작을 방지할 수있다. 
 * 
 * 객체지향의 가장큰 장점 : 
 * 	- 코드의 재사용성이 높고 유지보수가 용이하다. 
 * 
 * 		★★★★★★★★★★★★★★★★
 *		 클래스와 객체의 정의와 용도 
 * 	
 * 		 클래스란? 
 * 		 - 객체를 정의해 놓은것 또는 
 * 		   객체의 설계도 또는 틀이라고 정의할 수 있다.
 * 		   즉, 클래스는 객체를 생성하는데 사용된다. 
 * 		   클래스란 객체를 정의해 놓은것.
 * 		
 * 		 클래스의 정의 :  객체란 클래스에 정의된 형태로 생성됨
 * 		 클래스의 용도 : 클래스는 객체를 생성하는데 사용된다. 
 * 
 * 		 객체
 * 		 - 클래스에 정의된 대로 생성됨 
 * 		 - 실제로 존재하는것 
 * 		 - 프로그래밍에서의 객체는 클래스에 정의된 내용대로 메모리에 생성된 것을 뜻함 
 * 		 
 * 		객체의 정의 : 실제로 존재하는 것, 사물 또는 개념 
 * 		객체의 용도 : 객체가 가지고 있는 기능(매소드)과 속성(필드, 변수)에 따라 
 * 	  --------------------------
 * 			클래스 			객체 
 * 		제품 설계도			제품
 * 		 tv 설계도			TV
 * 		붕어빵 기계		   붕어빵 	
 *   --------------------------
 * 
 * 		 인스턴스 
 * 			- 클래스로부터 만들어진 객체를 인스턴스
 * 
 * 
 * 
 * */
// 클래스가 생성됨.
class TV{  // TV라고하는 설계도를 만들었다. 
// 속성 : 맴버필드, 변수 라고 함 
	String color;  // 샐깔 속성 등록 
	boolean power; // 전원 상태 속성 등록 
	int channel; // 채널 설정 
	
	// 기능 : 메소드, 함수 
	void power() {power =!power;} // void = 돌려받을 값이 없다라는 뜻임. / () - 실행 해야할 일이 들어감  on 들어가면 off/ off들어가면 on 
	void channelUP() {channel ++;}
	void channelDown() {channel --;}

}
	// --> 선언한것. 만든것에 불과한 설계도임.  -->클래스는 설계도를 의미함. 
	//  TV라고 하는 클래스를 사용하기 위해서는 객체(인스턴스)를 생성해야 사용할 수 있다. 
	/*
	 *  클래스명 변수명 ; 				--> 클래스의 객체를 참조하기 위한 참조변수 선언 
	 *  변수 명  = new 클래스명 ();--> 객채명을 생성한 후, 객체의 주소를 참조변수에 저장한다. 
	 *  
	 *  Tv t;
	 *  t = new Tv();
	 * 
	 * 
	 * */
	

public class ClassEx01 {

	
	public static void main(String[] args) {
		
		TV t; 					// TV라고 하는 인스턴스를 참조하기 위한 변수 t를 선언
		  t = new TV();	// TV 인스턴스 생성
		  t.channel = 7; 	// TV 인스턴스의 맴버를 channel 의 값을 7로 설정 
		  t.channelUP();  // TV 인스턴스 매소드 channelUP을 호출했다. --> 7 호출 후에 업했으니 현재의 채널은 8이다.
		  System.out.println("현재의 채널은 "+t.channel+"번 입니다.");
		
		  TV t1 = new TV();
		  TV t2 = new TV(); //  TV라는 클래스로 인해 참조변수 2개가 선언됨 .
		  System.out.println("t1현재의 채널은 "+t1.channel+"번 입니다.");
		  System.out.println("t2현재의 채널은 "+t2.channel+"번 입니다.");		
		
		  t1.channel =24; 
		  System.out.println("t1현재의 채널은 "+t1.channel+"번 입니다.");
			t2 = t1; // t1이 저장하고 있는 값을 t2에 저장하겠다. 
			
			System.out.println("t2현재의 채널은 "+t2.channel+"번 입니다.");		
			
			TV tv1, tv2, tv3;
			// 객체배열로 묶을 수 있다. 
			TV [] tvArry = new TV [3];
			tvArry [0] = new TV();
			tvArry [1] = new TV();
			tvArry [2] = new TV();
			
			// int a, b, c;
			for (int i =0 ; i < tvArry.length; i++)
				tvArry[i] = new TV();
			
			
	}
	
	
}
