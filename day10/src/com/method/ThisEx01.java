package com.method;




class ThisEx {
	
	String name; // 클래스 변수 -> 클래스 변수를 대체하는 것이 바로 this 라는 용어임!
	String jumin;
	String tel;
	
	public ThisEx() {// 생성자 생산
		this.name = "홍길동"; // -> this - ThisEx 를 가르키기 때문에 안에 변수를 사용할 수 있는것 
		this.jumin = "000000-0000000";
		this.tel = "010-0000-0000"; // 이렇게 값을 초기화 하는 것임 
	}
	
	public ThisEx(String name) { // 생성자 오버로딩 
		this(); // 다른 생성자를 의미할떄 public 안에 들어있는 애들 
		// 오버로딩된 다른 생성자를 호출 할때 사용한다. 
		// 다른 생성자를 호출 할때는 생성자 첫줄에 기술한다. // 반드시 this(); 첫번째 라인에 안착을 시켜야지 가능하다. 
		this.name = name;
		 
	}
	
	public ThisEx(String name, String jumin) { // 생성자 오버로딩 
		this(name); // 매개 변수가 있는 녀석을 호출하게 되는 것임 
		this.jumin = jumin;
		
	}
	public ThisEx(String name, String jumin, String tel) { // 생성자 오버로딩 
		this(name,jumin); // 똑같이 위에있는거 가져올려면 같은 매개변수의 이름을 this 속에 넣어주면 됨 
		this.tel = tel;
		
	}

	public String getName() {
		return name;
	}

	public String getJumin() {
		return jumin;
	}


	public String getTel() {
		return tel;
	}


	
	
	
}


public class ThisEx01 {

	public static void main(String[] args) {

		ThisEx t = new ThisEx(); // 이름만 바꾸고 싶을때 매개변수 안에다가 이름만 바꾸면 됨 / 또는 ,하고 전화번호 바꿀 수있음 
		System.out.println("name : "+t.getName());
		System.out.println("jumin : "+t.getJumin());
		System.out.println("tel : "+t.getTel());
			
		
	}

}
