package com.son;

class ParentEx {
	
	int foo = 5; //필드 
	
	public int  GetNumber(int a) { //매소드 
		return a + 1;
	}
}
	
	public class Son extends ParentEx {
		private int foo =7;
		
		public int  GetNumber(int a) { //매소드 
			return a + 2;
		}
		
		public int getFoo() {
			return this.foo;
		}
	
	public static void main(String[] args) {
		ParentEx p = new Son();
		System.out.println(p.GetNumber(0)); // 2
		System.out.println(p.foo); // 5  
		// 매소드는 자식꺼 매버필드는 부모것을 사용한다. 
		
	}

}
