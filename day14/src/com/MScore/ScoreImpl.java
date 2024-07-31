package com.MScore;

import java.util.*;

public class ScoreImpl implements Score {

	private Map<String, ScoreVO> map = new HashMap<>();
	// hashmap : 키 값을 정렬되어 있지 않음 
	//private TreeMap<String, ScoreVO> map = new TreeMap<>();
	// treemap = 키값으로 정렬되어 있다. 
	private Scanner sc = new Scanner(System.in);

	@Override
	public void insert() {

		System.out.println("\n자료 추가 ...........");

		String hak;
		System.out.println("학번 입력 :");
		hak = sc.next();

		if (map.containsKey(hak)) {
			System.out.println("이미 등록된 학번입니다.");
			return;
		}

		// 학번이 존재하지 않는다면
		ScoreVO vo = new ScoreVO();
		// System.out.println("이름 :");
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
		// 추가
		map.put(hak, vo);
		System.out.println("\n자료 추가 완료 ...");

	}

	@Override
	public void update() {

		System.out.println("\n자료수정 .............");
		String hak;
		System.out.println("수정할 학번 : ");
		hak = sc.next();

		// 수정할 학번이 벡터에 저장이 되어있으면 학번이 리턴되고 그렇지 않으면 널이 리턴된다.

		if (!map.containsKey(hak)) {
			System.out.println("등록된 학번이 아닙니다.");
			return;
		}

		ScoreVO vo = map.get(hak);

		System.out.print("이름 입력 : ");
		vo.setName(sc.next());
		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());

		System.out.println("국어점수 : ");
		vo.setKor(sc.nextInt());
		System.out.println("영어점수 : ");
		vo.setEng(sc.nextInt());
		System.out.println("수학점수 : ");
		vo.setMat(sc.nextInt()); // 벡터에 그대로 저장되는 상태

		System.out.println("자료 수정이 완료되었습니다.\n");

	}

	@Override
	public void delate() {

		System.out.println("\n자료수정 .............");
		String hak;
		System.out.println("삭제할 학번 : ");
		hak = sc.next();


		if (!map.containsKey(hak)) {
			System.out.println("이미 등록된 학번입니다.");
			return;
		}

		// 맵에서 저장된 키값을 삭제처리
		map.remove(hak); // 벡터에 저장된 학번가지고 있는 변수 vo를 삭제한다

		System.out.println("자료 삭제가 완료되었습니다.\n");

	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		System.out.println("\n전체 출력 ...........");
		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = map.get(hak);

			System.out.println(vo);
		}
		System.out.println();

	}

	@Override
	public void searchHak() {
		System.out.println("\n전체 출력 ...........");

		String hak;
		System.out.println("검색할 학번 입력 : ");
		hak = sc.next();


		if (map.containsKey(hak)) {
			System.out.println("이미 등록된 학번입니다.");
			return;
		}

		ScoreVO vo = map.get(hak);
		System.out.println(vo);
		System.out.println();
		

	}

	@Override
	public void secrchname() {
		System.out.println("\n이름 검색 ....................");

		String name;
		System.out.println("검색할 이름 입력 : ");
		name = sc.next();
		
		Iterator<String> it = map.keySet().iterator();
		
		while (it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = map.get(hak);

			System.out.println(vo);
		}
		
		System.out.println();
	}

	
}
