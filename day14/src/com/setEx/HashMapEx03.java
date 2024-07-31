package com.setEx;

import java.util.*;

public class HashMapEx03 {

	static HashMap phoneBook = new HashMap();
	
	// 그룹에 전화번호를 추가하는 매소드 
	static void addPhoneNo(String groupName, String name, String tel) {  // 오버로딩 : 같은 이름의 매소드 여러번 정의하되 다른 타입으로 다르게 정의 하는것 
		addGroup(groupName);
		HashMap group =(HashMap)phoneBook.get(groupName);
		group.put(tel, name); // 이름은 중복될 수 이 있으나 전화번호를 키로 저장한다 
		
	}
	
	//그룹을 추가하는 매소드 
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap());
		
	}
	
	static void addPhoneNo(String name, String tel) { // 전화번호 받아서 줌 
		addPhoneNo("기타", name, tel);
		
	}
	
	// 전화번호부 전체를 출력하는 메소드 
	static void printList() {
		
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry e =(Map.Entry) it.next();			
			
			Set subSet = ((HashMap)e.getValue()).entrySet();
			
			Iterator subIt = subSet.iterator();
			
			System.out.println("*"+ e.getKey()+"["+subSet.size()+"]");
			while (subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String) subE.getKey();
				String name = (String) subE.getValue();
				System.out.println(name + " "+telNo);
				
			}
			System.out.println();
			
		}
				
		
		
	}
	
	
	
	public static void main(String[] args) {
		addPhoneNo("친구", "이자바","010-1111-1111");
		addPhoneNo("친구", "김자바","010-1112-1111");
		addPhoneNo("친구", "홍자바","010-1113-1111");
		addPhoneNo("친구", "세자바","010-1114-1111");
		addPhoneNo("회사", "김대리","010-4445-4444");
		addPhoneNo("회사", "최대리","010-4446-4444");
		addPhoneNo("회사", "이대리","010-4447-4444");
		addPhoneNo("세탁", "010-8888-8888");
		printList();
		
		
		
	}

}
