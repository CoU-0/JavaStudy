package com.exam;


//문자열 입력 : 문자가 하나이상일 떄 입력받기 
import java.io.*;
import java.util.*;


public class InputEx04 { // 버퍼 이용방법 

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in); // sc.close(); 닫아달라고 하는거 안써도상관이 없음 
		
		
		String name1 ;
		String name2 ;
		char name3 ;
		
		
		System.out.print("이름 입력 : ");
		//name =br.readLine();
		//name1 = sc.next(); // 문자열만 리턴(읽는데)
		//System.out.print("이름 입력 : ");
		//name2 = sc.nextLine(); // \n 이걸 포함한 라인을 읽고 \n을 버리고 문자열만 리턴함 
		name3 = sc.nextLine().charAt(0); //첫번째 인덱스 0 -> 한글자만 읽음 / 한글자만 
		
		//System.out.println(name1);
	    System.out.println(name3);
	    
	    
//		String name ;
//		System.out.print("이름 입력 : ");
//		name =br.readLine();
//		System.out.println(name);
	}

}
