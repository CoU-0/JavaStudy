package com.paractice;

/*
 * 노래 한곡을 나타내는 song 클래스를 작성하시오.
 * 
 * song 클래스의 필드는 다음과 같다 
 * 1. 노래의 제목을 나타내느 title --> 필드명 / 생성자에서 출력 
 * 2. 가수를 나타내는 artist; -->  	필드명 / 생성자 
 * 3. 국적을 나타느낸 country --> 	
 * 
 * 생성자는 2개를 만든다. 
 * 1번 기본 생성자 / 매개변수  - > 모든 필드값을 초기화 하는 생성자 this 를 써서 전부 초기회 
 * 2번 노래 정보를 출력하는 show() 메소드 -> 
 * 
 * main () 메소드에서 다음과 같은 노래 정보를 입력하고 출력한다. 
 * 1978년 / 스웨던 / ABBA / Dancing Queen  메인에서 매개변수에 넣어라 이런뜻? 
 */

public class Song001 { // 필드 

	String title;
	String artist;
	String country;
	int year;
	
	public Song001() {}
	
	public Song001(int year, String country, String artist, String title) { // 생성자
			this.artist = artist;
			this.title = title;
			this.country = country;
			this.year = year;
		}
		
	public void show() { //매소드 
		System.out.println(year+"년" + country + " 국적의 " + artist + "가 부른 " + title);
	}
	
	public static void main(String[] args) {
		Song001 so = new Song001("1978","스웨덴", "ABBA", "Dancing Queen");
		so.show();
		
	}

}
