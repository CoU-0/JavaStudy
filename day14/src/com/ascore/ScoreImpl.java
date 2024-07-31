package com.ascore;

import java.util.*;

public class ScoreImpl implements Score {
// list는 인터페이스이기때문에 구현 안됨 - >array list 
	private List<ScoreVO> list = new ArrayList<>(); // 컬렉션 arrayList 
	private Scanner sc = new Scanner(System.in);

	@Override
	public void insert() {

		System.out.println("\n자료 추가 ...........");

		String hak;
		System.out.println("학번 입력 :");
		hak = sc.next();

		ScoreVO temp = readScore(hak); // 이미 있는 학번이라면 temp에 들어가겠지
		// 학번이 vector에 저장되어 있다면 (이미 등록된 학번이라면 ) - 중지하겠다
		if (temp != null) { // 이미 등록된 학번이 존재한다면
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
		// 벡터에 추가
		list.add(vo);
		System.out.println("\n자료 추가 완료 ...");

	}

	@Override
	public void update() {

		System.out.println("\n자료수정 .............");
		String hak;
		System.out.println("수정할 학번 : ");
		hak = sc.next();

		ScoreVO vo = readScore(hak); // 내가 입력하 학번에 존재하는지 체크 = 단! vo값이 null이 아니여야 수정이 가능하다. // 널이든 학번이든 넘겨줌 -
		// 수정할 학번이 벡터에 저장이 되어있으면 학번이 리턴되고 그렇지 않으면 널이 리턴된다.
		if (vo == null) {
			System.out.println("등록된 자료가 없습니다.");
			return;
		}

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

		ScoreVO vo = readScore(hak); // 내가 입력하 학번에 존재하는지 체크 = 단! vo값이 null이 아니여야 수정이 가능하다. // 널이든 학번이든 넘겨줌 -
		// 수정할 학번이 벡터에 저장이 되어있으면 학번이 리턴되고 그렇지 않으면 널이 리턴된다.
		if (vo == null) {
			System.out.println("등록된 자료가 없습니다.");
			return;
		}
		list.remove(vo) ; //벡터에 저장된 학번가지고 있는 변수 vo를 삭제한다 

		System.out.println("자료 삭제가 완료되었습니다.\n");
		
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
		System.out.println("\n전체 출력 ...........");
		
		String hak;
		System.out.println("검색할 학번 입력 : ");
		hak =sc.next();
		
		ScoreVO vo = readScore(hak);
		if(vo== null) {
			System.out.println("검색하고자 하는 학번은 존재하지 않습니다.");
			return;
		}else if (vo != null) { // 
			System.out.println(vo.toString());  // toString에 출력폼을 만들어 놓음  
			// toString - 오브잭트 객체를 갖는 매소드 - 클래스 안에 있는 모든 문자열을 리턴할 수있는 애
			// 양식을 만들어 놔서 출력이 가능 
		}
		
	}

	@Override
	public void secrchname() {
		System.out.println("\n이름 검색 ....................");
		
		String name;
		System.out.println("검색할 이름 입력 : ");
		name = sc.next();
		for (ScoreVO vo : list) {
			if (vo.getName().startsWith(name)) {
				System.out.println(vo.toString());
			}
		}
		System.out.println();
	}

	public ScoreVO readScore(String hak) { // 벡터를 읽을때 -> 수정데이터가 null인지 아닌지 파악 해야함
		ScoreVO vo = null;

		for (ScoreVO temp : list) {
			if (temp.getHak().equals(hak)) {
				vo = temp;
				break;
			}
		}
		return vo; // vo에 넣은값을 다시 돌려준다. -> 다른곳에서 받은 vo도 다른곳에 돌려준다는것
	}
}
