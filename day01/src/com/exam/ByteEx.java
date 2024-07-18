package com.exam;

/*byte : 1byte 정수형 자료형 (256=> 0에서 부터 255까지 인데 정수형은 -128 ~ 127 까지 )
 *			값을 표현할 수 있는 범위(-128 ~ 127)가 중요 
 * 
 * 
 * 
 */



public class ByteEx {

	public static void main(String[] args) {
		byte bb = 127;
		/*자바에서는 컴파일시 error가 발생된다.  범위내에 숫자를 설정하지 않았을 경우 
		 * 
		 * 
		 * */
		
		bb++; // 양수에서 더이상 표현이 안되면 음수값을 끌어옴 
		
		
		System.out.println(bb);
		
		
		
		
		

	}

}
