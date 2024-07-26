package com.son;



class person {
	String name;
	String jumin;
	
public person (String name) { // 생성자
	this.name = name;
	
	}
}

class Student extends person {
		String grade;
		String department;
		
		public Student (String name) {
			super(name);
		}
	
}
public class UpcastingEx {

	
	public static void main(String[] args) {
		//person p;
		//Student s = new Student("홍길동");
		//p = s;
		//업캐스팅 
		 // new Student 를 이용해서 p를 만들었다라는 읨 
		person p = new Student("홍길동"); 
		System.out.println(p.name);
		
		person p1 = new person("홍길동"); 
		Student s = (Student)p; // 부모 클래스의 참조 변수를 이용하여 자식클래스의 참조변수를 활용한다.
									  	  // 이럴때 컴파일 에러가 나므로 부모 클래스의 참조변수앞에 자식클래스명을 명시해야한다.
		s.grade = "A";
		System.out.println(s.grade);
		
		
	}

}
