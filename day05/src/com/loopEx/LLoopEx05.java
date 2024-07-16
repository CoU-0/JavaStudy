package com.loopEx;

public class LLoopEx05 {

	public static void main(String[] args) {

		int i =1 ;
		System.out.println("일\t월\t화\t수\t목\t금\t토 ");
		while (i<=31) { 
			if ( i % 7 ==0) {
				System.out.println(i);
			}else {
				System.out.print(i+"\t");
			}
			i++;
		}
		
		
	}

}
