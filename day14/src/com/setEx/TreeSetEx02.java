package com.setEx;

import java.util.*;
public class TreeSetEx02 {

	public static void main(String[] args) {

		TreeSet set =new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i = 0; i<score.length;i++) {
			set.add(new Integer(score[i]));
			
		}
		System.out.println(set); // set에 데이터 저장 / 데이터 정렬이 되어있음 
		System.out.println("50보다 작은 값 : " +set.headSet(new Integer(50))); // 50을 기준으로 하겠다 
		System.out.println("50보다 큰 값 : " +set.tailSet(new Integer(50))); // 50을 기준으로 하겠다 
		
		
		
	}

}
