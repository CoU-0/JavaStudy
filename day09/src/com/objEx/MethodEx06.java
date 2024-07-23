package com.objEx;





public class MethodEx06 {

 	 void method(int n){ // 매소드 내부에서 본인 mothod n을 호출함 
		if (n == 0) {
			return ; 
		}
 		 System.out.println(n);
 		 method(--n); //  자기 자신을 다시 호출하는 것을 재기 호출  --n 감소 후 대입  
 		 
	}
// public void method(int n) 퍼블릭 생략 가능 
		
	
	
	
	public static void main(String[] args) {
		MethodEx06 me = new MethodEx06();
		me.method(20);
		
		
		
	}

}
