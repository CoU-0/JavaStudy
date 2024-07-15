package com.ForEx;

/*
 * 문]
 * 	-1^2  +  2^2  -  3^2 + 3^2 - 5^2 + 6^2 - 7^2 ~~~ 100^2 
 * 
 * 
 * - 일때 +  / +일때 마이너스 
 * 홀수 = - 
 * 
 * 
 * 1. 1~ 50까지더하는 식 
 * 2. 
 */



public class WhileEx05 {

	public static void main(String[] args) {
      
		int a = 1, sum =0, plus =1 ;
				
		while (a <= 100 ) {
			plus = -plus;
			sum += plus*(a*a);
			a++;
			
			
		/*
		 *  if ( a%2 ==0){
		 *   sum +=(a*a);
		 *  }else {
		 *  	sum -=(a*a);
		 *  }
		 *  a++;
		 * 
		 * 
		 *  	   
		 * 
		 * 
		 * 
		 * */
		
		
		}
		
		System.out.println("합계 : " +sum);
		

	}

}
