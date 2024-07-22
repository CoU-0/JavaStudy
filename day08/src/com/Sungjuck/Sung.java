package com.Sungjuck;

import java.util.Scanner;

/*
 * 
 * 
 * Sung : 인원수를 입력받아 입력받은 인원수만큼 이름, 국어, 영어, 수학 점수를 입력받고 총점, 평균, 석차를 구하는 클래스를 설계
	속성 : 인원수, 객체의 배열,
    기능 : 인원수 입력, 데이터 입력기능, 총점 평균, 석차를 계산하는 기능, 결과를 출력하는 기능
 * 
 * 
 * 
 * 
 * */


public class Sung {
	// 주요 속성 선언
	int inwon; // 인원수 
	Record[] rec; // 레코드라고 하는 객체배열을 이용해서 배열 선언 
	
	
	// 인원수 입력 (메소드 -> 하나의 기능이라고 생각하면됨)
	public void set(){ // set 이라는 메소드 사용 --> 인원수를 입력하는 메소드
	Scanner sc = new Scanner(System.in);
	// 최소 1명에서 100명까지의 범위를 설정한다. 
	
	do {
		System.out.print("인원 수 입력");
		inwon = sc.nextInt(); // 쓴만큼 메모리를 할당해야함 -> 그래서 나온게 Record[] rec를 만들어둔거임 
	}while(inwon < 1 || inwon >100); // 조건 안맞으면 다시 입력받을 수 있게끔 
	
	
	// Record 클래스의 인스턴스를 생성한 것은 아니다. 
	// 참조 변수를 만든것이지 객체를 만든것은 아님.  --> re[0] = new record(); 이게 객체를 만든것임 
	rec = new Record[inwon]; //  Record 클래스에 인원만큼 생성한다. 
	//Record[] rec = new Record[inwon]; //  Record 클래스에 인원만큼 생성한다. -
	// 변수는 2번 쓸수 없음 - > 두번 선언했기 때문에 다른 값이 들어있는것임 -> 또 변수를 사용하게 되면 저장 할 수 없음  
	
	
	
	}
	//데이터 입력 및 총점 평점 계산 메소드 
	public void input() { 
		Scanner sc = new Scanner(System.in);
		String [] title = {"국어점수 : ","영어점수 : ","수학점수 : " };
		for(int i = 0; i <inwon;i++) {
		
			
			// 객체배열 인스턴스 생성 ★★★★★ 중요
			rec[i] = new Record(); // Record가 만들어 졌으니 여기에 있는 클래스에 접근을 할 수가 있ㅇ므  
			
			
			System.out.print((i+1)+"번째 이름 입력 : ");
			rec[i].name = sc.next();
			
			// 세개의 과목점수를 입력받는다. 
			for (int j = 0; j <title.length; j++) { // 국영수 3개 만큼 
				System.out.print(title[j]); // 과목별 점수 안내 메시지 출력 
			// 입력받은 점수를 Record 클래스의 score[] 배열에 저장한다 
			rec[i].score[j]  = sc.nextInt();// 0 -> 국어 / 1 -> 영어 2 -> 수학 
			
			// 총점을 누적시킨다. 
			rec[i].tot += rec[i].score[j];
			
				
			} // 과목별 점수를 입력받아 총점을 구함 
			
			//평균을 구함 
			rec[i].avg = rec[i].tot/3.0;
			
		
		}
		
	}
	
	// 석차를 계산하는 클래스 
	public void ranking() {
		int i, j; 
		 // 모든 학생의 석차를 모두 1등으로 초기화 해야함 .
		 
		for ( i =0; i<inwon; i++) 
			
			rec[i].rank = 1;  // 비교해서 큰것보다 작아지면 석차가 하나씩 더해지도록 
		
		// 석차 계산  -1을 해서 자리수 맞추기 
		for( i = 0; i<inwon-1; i++) { // 0과 1 
			
			for(j = i+1;j<inwon; j++) { // 1과 2로 
				if (rec[i].avg > rec[j].avg) {
					rec[j].rank++;
				}else if (rec[i].avg <rec[j].avg) {
					rec[i].rank++;
					
				}
				
			}
			
		}

	}
	// 결과 출력 
	public void display() {
		ranking();
		
		System.out.println();
		System.out.println("이름\t 국어  영어 총점  평균  석차");
		
		for(int i = 0; i<inwon; i++ ) {
			// 이름 출력 
			System.out.printf("%3s",rec[i].name);
			// 성적 (국어, 영어, 수학)출력 
			for (int j =0; j <3; j++) {
				
				System.out.printf("%4d", rec[i].score[j]);
			}
			
			//총점, 평균, 석차 
			System.out.printf("%5d",rec[i].tot);
			System.out.printf("%7.2f",rec[i].avg);
			System.out.printf("%5d",rec[i].rank);
			System.out.println();
		}
		
			System.out.println();
		
	
	
	
	
	
	}
	
}
