package com;

public class DoWhileEx01 {

	public static void main(String[] args) {
		
		int i =2;
		
		do {
		
		
			
			
			
		while(i <=9) {
			int j =1; 		// 초기값을 바깥쪽에다 잡을 경우 - > 오류  // 안쪽의 변수를 다시 설정해 줘야지 정상작동 
			while(j<=9) {
				System.out.println(i+"x"+j+"="+(i*j));
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		}
	}

}
