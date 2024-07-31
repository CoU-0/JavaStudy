package com.MScore;

import java.io.IOException;

/*
 * 메뉴를 구성해서 출력하는 프로그램을 만들어라 
 * 
 * 
 */

public class ScoreMain {

	public static void main(String[] args) throws IOException{
		char ch; 
		Score score = new ScoreImpl(); // 인터페이스를 구현한 클래스를 만듦 
		
		while(true) {
			do {
				System.out.println("1.추가 2.수정 3.삭제 4.전체출력 5.학번검색 6.이름검색 7.종료");
				ch=(char)System.in.read();
				System.in.skip(2);
				
				
			}while(ch< '1' || ch >'7');
			
			switch(ch) {
			case '1' : score.insert(); break;
			case '2' : score.update();break;
			case '3' : score.delate(); break;
			case '4' : score.listAll(); break;
			case '5' : score.searchHak(); break;
			case '6' : score.secrchname(); break;
			
			case '7' : System.exit(0);
			}
			
		}
		
		
	}

}
