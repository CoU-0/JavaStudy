package com;

public class DoWhileEx001 {

	public static void main(String[] args) {


		int i =1;
		
		while(i <=5) {
			int j =1; 		// 초기값을 바깥쪽에다 잡을 경우 - > 오류  // 안쪽의 변수를 다시 설정해 줘야지 정상작동 
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			i++;
		}
		System.out.println();

		
		
		
		
		
	}

}
