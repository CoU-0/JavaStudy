package com.exam;



// 슬래쉬슬래쉬 - 한줄 주석처리 
/*여려줄 주석처리 */

/*		자바의 클래스명의 첫글자는 대문자로 시작 
 * 		자바 프로그램을 시작할때는 class, main()함수를 기본적으로 입력해야한다. 
 * 		소스 저장시 클래스명과 동일한 파일명으로 저장한다. <불일치 시 오류 발생>
 * 		확장자명 : ~.java 
 * 
 */



public class Exam001 { // 클래스명 

	public static void main(String[] args) {// 메인 매소드
		// 실제 코딩영역
		// 소스 코드를 작성함

		System.out.println("프로그램 실행");
		// 출력
		System.out.println();
		// sys + control +space
		// 주석문 처리 동일 ctrl + /	
		// ctrl + shift + "F" 
		
		System.out.println("이름 : 채우영");
		System.out.println("주소 : 서울");
		System.out.println("전화 번호 : 00000000000");
		System.out.println(); // 공백 
		//변수 선언해서 프로그램을 구현 
		
		String name ="홍길동";
		String addr ="서울";
		String tel ="00000000000 ";
		System.out.println("이름 : "+name);
		System.out.println("주소 :"+addr);
		System.out.println("전화 번호 : "+tel);
		System.out.println(); // 공백 
		
		System.out.printf("이름 : %s%n",name); // 서식문자 
		System.out.printf("주소 : %s%n",addr); // 서식문자 
		System.out.printf("전호번호 : %s%n",tel); // 서식문자 
		
		
		
		
		
		
	}

}











