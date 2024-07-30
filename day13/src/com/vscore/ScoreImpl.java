package com.vscore;

import java.util.*;

public class ScoreImpl implements Score {

	
	private Vector<ScoreVO>list = new Vector<ScoreVO>(); 
	private Scanner sc = new Scanner(System.in);
	
	
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub

		System.out.println("\n자료 추가 ...........");
		
		String hak;
		System.out.println("학번 입력 :");
		hak = sc.next();
		
		ScoreVO temp = readScore(hak); // 이미 있는 학번이라면 temp에 들어가겠지 
		// 학번이 vector에 저장되어 있다면 (이미 등록된 학번이라면 ) - 중지하겠다 
		if (temp !=null) { // 이미 등록된 학번이 존재한다면 
			System.out.println("이미 등록된 학번입니다.");
			return ;
		}
		// 학번이 존재하지 않는다면 
		ScoreVO vo = new ScoreVO();
	//	System.out.println("이름 :");
		vo.setHak(hak);
		System.out.println("이름 :");
		vo.setName(sc.next());
		System.out.println("생년월일 :");
		vo.setBirth(sc.next());
		System.out.println("국어점수 :");
		vo.setKor(sc.nextInt());
		System.out.println("영어점수 :");
		vo.setEng(sc.nextInt());
		System.out.println("수학점수 :");
		vo.setMat(sc.nextInt());
		// 벡터에 추가 
		list.add(vo);
		System.out.println("\n자료 추가 완료 ...");
		
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		System.out.println("\n전체 출력 ...........");
		Iterator<ScoreVO> it = list.iterator();
		
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo);
		}
		System.out.println();
		
		
	}

	@Override
	public void searchHak() {
		// TODO Auto-generated method stub

	}

	@Override
	public void secrchname() {
		// TODO Auto-generated method stub

	}

	public ScoreVO readScore(String hak) {
		ScoreVO  vo = null;
		
		for (ScoreVO temp : list) {
			if (temp.getHak().equals(hak)) {
				vo = temp;
				break;
			}
		}
		return vo;
		
		
	}
}
