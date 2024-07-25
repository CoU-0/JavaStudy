package com.objeEx;

public class Phonemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MP3Phone mp = new MP3Phone
				("모토로라", "010-1111-1111", 60, 250);
		System.out.println
		("전화기 모델은"+mp.model+"이고\n 전화번호는 "+mp.number+"이며\n 화음은"+mp.chord+" 이고\n 용량은 "+ mp.size +"입니다.");
	}

}
