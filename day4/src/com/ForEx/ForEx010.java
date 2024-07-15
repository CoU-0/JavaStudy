package com.ForEx;

/*문1]
 * 알파벳을 출력하는 프로그램을 작성하시오  
 * 
 * 문2]
 * 알파벳을 하나씩 줄여가는 프로그램을 작성하시오 
 * 
 * 
 * */

public class ForEx010 {

	public static void main(String[] args) {
/*
		for (char i = 'A'; i <= 'Z'; i++) { // 초기 값에 아에 처음부터 문자를 넣어서 출력 - > 범위 설정 A~Z 까지 출력되는 형식으로

			System.out.print(i);
		}
*/	
		/*System.out.println();
		for (char a = 'A'; a <= 'Z'; a++) {
			for (char b = a; b <= 'Z'; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
        */
		
		/*
		 * 아스키 코드값을 사용한 방법
		 * 
		 * for (int a = 65; a<=90; a++){ 
		 * sysout ((char)a); }
		 * 
		 * 
		 */
/*
		System.out.println();
		for (char a = 'A'; a <= 'Z'; a++) {
			for (char b = a; b <= 'Z'-(a-65); b++) {
				System.out.print(b);
			}
			System.out.println();
		}
	*/	
		
		//System.out.println();
		for (char a = 'A'; a <= 'Z'; a++) {
			for (char b = a; b <= 'Z'-(a-65); b++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
