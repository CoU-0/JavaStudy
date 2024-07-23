package com.objEx;

class Salary{
	
	private int pay; // 매소드로만 접근 가능  -> set / get  // 인스턴스 -> 객체 생성해야함 

	public int getPay() {
		return pay;
	}

	public void setPay(int pay, String pass) {  // 매개변수 등록 
		// 입력이 20 넣으면 - > thispay에 들어가게 되도 -> 이게 private int pay로 들어감 
		if(pass.equals("1234"))
				
		this.pay = pay; // this - > salary 를 가르킴 
	// ->비밀번호가 1234일때 this.pay 접근할수 있다는 의미 
	}
	
	
	
	
	
	
	
}


public class SalaryEx {

	public static void main(String[] args) {

		Salary sa = new Salary();
		// 인스턴스 생성 완료 (객체를 생성했다.)
		//sa.pay =10000; 이건 프라이베이트 때문에 안됨 
		sa.setPay(10000, "1234");
		int mypay = sa.getPay(); // 돈의 값을 구하는것 
		System.out.println("나의 돈 :"+mypay);
	}

}
