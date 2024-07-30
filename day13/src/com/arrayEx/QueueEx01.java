package com.arrayEx;

import java.util.*;
public class QueueEx01 {

	static Queue q = new LinkedList<>();
	static final int MAX_SIZE  = 5; // q에 최대 5까지 저장하겠다는 변수  
	
	
	public static void main(String[] args) {
		
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.println(">>");
			try {
				
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim(); // 양쪽 공백 없이 문자열만 trim
				
				if("".equals(input))continue;
				if (input.equalsIgnoreCase("q")) {
					System.exit(0);
				}else if (input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어를 "+MAX_SIZE+"개를 보여줍니다.");
				}else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					// 입력받은 명령어를 저장하고 
					save(input);
					// LinkedList의 내용을 보여줌 
					
					LinkedList tmp = (LinkedList)q; // 인터페이스이기 떄문에 형변환
					ListIterator it = tmp.listIterator();
					
					while (it.hasNext()) {
					System.out.println(++i+"."+it.next());
						
					}
				
				}else {
					save(input);
					System.out.println(input);
				}
				
				
			}catch(Exception e) {
				System.out.println("입력오류입니다.");
			}
		}
	}
		public static void  save(String input) {
			// Queue 에 저장함 
			if (!"".equals(input))
				q.offer(input); // 명령어 있으면 q에 저장한다
			 
			// queue 최대 크기를 넘기면 제일 처음으로 입력된 것을 삭제처리함 
			if(q.size() > MAX_SIZE)
				q.remove();
		}
	
}
