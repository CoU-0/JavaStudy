package com.arrary;
import java.util.*;
/*
 * 		문]
 * 			처음 입력 받은 인원수 만큼의 학생의 이름과 전화번호를 입력 받고 
 * 			입력받은 내용을 전체 출력하는 프로그램을 구현하라 
 * 			단, 배열을 활용해서 
 * 
 * 			
 * 			결과 
 * 
 * 			입력 처리할 학생 수(명) : 
 * 			이름 전화번호 입력(1)[구분 공백으로] : 가길동 010 - 1234 - 1234 
 * 			이름 전화번호 입력(2)[구분 공백으로] : 나길동 010 - 1234 - 1234 
 * 			이름 전화번호 입력(3)[구분 공백으로] : 다길동 010 - 1234 - 1234 
 * 			
 * 
 * 			출력 
 * 			----------------
 * 			전체 학생 수 : 3
 * 			----------------
 * 			이름 	전화번호 
 * 			가길동 010 1111- 1234
 * 			나길동 010 2222- 1234
 * 			다길동 010 3333- 1234
 * 
 * 
 * */


public class ArrayEx5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n; // 인원수 입력 받는 변수 입력  
		
		System.out.print("입력할 처리할 학생수 : ");
		n = sc.nextInt();
		
		String[] name = new String[n]; // 이름 저장 공간 
		String[] phone = new String[n]; // 전화번호 저장 공간
		
		for (int i = 0 ; i <name.length; i++) {
			System.out.print("이름, 전화번호 입력 : ("+ (i+1)+")[공백구분]"); // 인덱스 상으로는 0번이기 때문에 1번부터 시작하려면 +1 
			name[i] = sc.next();
			phone[i] = sc.next();
		}
		System.out.println();
		System.out.println("-------------------------");
		System.out.println(" 전체 학생 수는 :"+n+" 명");
		System.out.println("-------------------------");
		System.out.println(" 이름     전화번호       ");
	 for (int i =0 ; i <name.length; i++) {
		 System.out.println(name[i]+"\t"+phone[i]);
	 }
	 System.out.println("----------------------------");
		
		
	}

}
