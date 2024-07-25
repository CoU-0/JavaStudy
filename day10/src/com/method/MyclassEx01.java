package com.method;

class MyClass{
	
	
	private String name; 
	private int age; 
	
	public MyClass() {
		name ="무명";
	}
	
	public MyClass(String n) {
		name = n; // 객체만들때 이름 넣겠다 이런 뜻 
	}
	public MyClass(int a, String n) {
		name = n;
		age = a;
	}
	
	public MyClass( String n,int a) {
		name = n;
		age = a;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}



public class MyclassEx01 {

	public static void main(String[] args) {
	 MyClass mc1 = new MyClass();
	 MyClass mc2 = new MyClass("아라치");
	 MyClass mc3 = new MyClass("마루치",23);
	 MyClass mc4 = new MyClass(23,"오자바");
	 
	 
	 System.out.println(mc1.getName()+","+mc1.getAge());
	 System.out.println(mc2.getName()+","+mc2.getAge());
	 System.out.println(mc3.getName()+","+mc3.getAge());
	 System.out.println(mc4.getName()+","+mc4.getAge());
				
		
		
	}

}
