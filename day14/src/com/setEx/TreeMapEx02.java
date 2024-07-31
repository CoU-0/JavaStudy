package com.setEx;

import java.util.*;

class SungRec {
	
	private String name; 
	private int kor, eng, mat, tot;
	
	public SungRec() { }
	
	public SungRec(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		tot = kor + eng + mat;
		return tot;
	}
	
	
}


public class TreeMapEx02 {

	public static void main(String[] args) {
	TreeMap <String, SungRec> map = new TreeMap<>();
	map.put("3333", new SungRec("김말자",80,80,70)); // 제일 앞이 키 값 
	map.put("2222", new SungRec("홍길동",100,80,70));
	map.put("1111", new SungRec("가길동",90,80,80));
	map.put("4444", new SungRec("나길동",90,90,90));
	map.put("5555", new SungRec("다길동",70,80,70));
	//System.out.print

		// 키 순서로 정렬 
	String key;
	Set set = map.keySet();
	Iterator it = set.iterator();
	while(it.hasNext()) {
		key = (String)it.next();
				SungRec data = map.get(key);
		System.out.printf("%5s %7s %3d %3d %3d %3d %n",key,data.getName(),data.getKor(),data.getEng(),data.getMat(),data.getTot());
	
	}
	
			
	}

}
