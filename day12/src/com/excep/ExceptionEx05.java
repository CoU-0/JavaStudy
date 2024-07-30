package com.excep;
//finally를 포함한 예외처리
//예외가 발생하든 안하든 무조건 실행하는 블럭

/*
 *  Exception   클래스의 주요 메소드
 *  
 *  1.printStackTrace()
 *   -예외가 발생할 당시에 호출스택에 있었던 메소드의 정보와 예외 메시지를 화면출력
 *   2.getMessage()
 *   -발생한 예외클래스의 인스턴스에 저장된 예외 메시지를 얻을 수 있는 메소드
 *   
 * 
 */
public class ExceptionEx05 {

	
	int[]ss;
	public ExceptionEx05() {
		ss=new int[3];
		
	}
	
	public void program() {
		for(int i=0; i<=ss.length;i++) {
			System.out.println("for문의 시작"+i+"번째");
			try {
				System.out.println(ss[i]);
			}catch(Exception e) {
				System.out.println("Exception 발생:"+e);
				return;
			}finally {
				System.out.println("finally 영역...");
			}
			 System.out.println("for문의 끝"+i+"번째");
		}
	}
	
	public static void main(String[] args) {
		

		ExceptionEx05 e= new ExceptionEx05();
		e.program();
		System.out.println("프로그램 종료...");
				
				
	}

}
