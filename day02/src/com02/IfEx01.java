package com02;

import java.io.*; // 
import java.util.*; // 스캐너 

public class IfEx01 {

	public static void main(String[] args) throws IOException  {
      //이건 버퍼 입력 
		BufferedReader br = 
    		  new BufferedReader(new InputStreamReader(System.in));
	 //스캐너 
		Scanner sc = new Scanner(System.in);
		
		
      int input;
      System.out.print("임의의 숫자 입력 : ");
      input = Integer.parseInt(br.readLine()); // int input = integer 
      
	/*	
	  int input2;	
	  System.out.print("임의의 숫자 입력 : ");
	  input2 = sc.nextInt();
	  */
      
      
      /*
      if (input==0) { // 조건이 참일 경우 
    	  System.out.println("입력하신 숫자는" + input+ "입니다.");
      } 
	     
    	  if (input!=0) { // 조건이 거짓인 경우 
        	  System.out.println("입력하신 숫자는" + input+ "이 아닙니다.");
        	  System.out.printf("입력하신 숫자는 %d입니다.%n",input);
    		}
    	 */ 
	// if else 
      
      if (input==0) { // 조건이 참일 경우 출력
    	  System.out.println("입력하신 숫자는 0 입니다.");
      } else { // 조건이 거짓인 경우 출력 
        	  System.out.println("입력하신 숫자는 0이 아닙니다.");
        	  System.out.printf("입력하신 숫자는 %d입니다.%n",input);
    		}

	}
}
