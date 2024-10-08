package com.ascore;

public class ScoreVO {

	private String hak, name, birth;
	private int kor, eng, mat, tot;

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; // 
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
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

	@Override
	public String toString() {// 문자열 반환 // 슈퍼클래스 속에 있기 때문에 필드에 정의하지 않아도 사용가능 
 // 슈퍼 클래스이기 때문에 
		String str = String.format("%7s%10s%7s%5d%5d%5d%5d%6.1f"
				, hak, name, birth, kor, eng, mat, getTot(),
				(float) (getTot() / 3));

		return str;
	}

}
