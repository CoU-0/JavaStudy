package com.ArrayEx;

/*
 * 주민등록번호를 입력받아 올바른 번호인지를 검증하는 프로그램을 구현 
 * 
 * 123456-3456789 
 * 연 월 일    4->지역
 * 
 * 		3 : 성별	
 * 		4 : 출생신고 등록지역
 * 		56 : 시도의 구, 군 
 * 		78 : 구 또는 동 읍 면 
 * 		
 * 
 * 
 * */
import java.io.*;
import java.util.Calendar;


public class ArrayEx11 {

	public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
      String name ="";
      int jumin[]= new int[14];
      boolean right = false; 
      
      
      System.out.print("이름 : ");
      name = br.readLine();
      
      do {
    	   right = false;
    	   System.out.print("주민번호의 입력 : ");
    	   for (int i = 0; i <jumin.length; i++) {
    		   jumin[i] =System.in.read()-48; // 버퍼 특징 - 숫자입력에 아스키코드 자리로 입력 - 1을 출력 - 49
    	   }
    	   System.in.read();
    	   System.in.read();
    	   
   
		
      //월, 일, 성별이 범위안에 존재하는지 범위가 벗어나면 계속 진행 시킴 
       if(jumin[2]*10 + jumin[3] > 12 ) {
    	   System.out.println("태어난 달은 12월보다 클수는 없습니다.");
    	   continue;
       }
       else if (jumin[4]*10 + jumin[5]>31) {
    		   System.out.println("태어난 일은 31일 보다 클 수 없습니다.");
    		   continue;   
    	 
       }else if (jumin[7] !=9 && jumin[7] !=0 && jumin[7] !=1 && jumin[7] !=2
    		 &&  jumin[7] !=3 && jumin[7] !=4) {
    	   System.out.println("9, 0, 1, 2, 3, 4, 중 하나여야 합니다. ");
    	   continue;
       }
		// 주민번호 검증 
       int hap = 0;
       int cre = 2;
       float temp =0.0f, temp1 = 0.0f;
       
       for (int i =0; i<jumin.length-1; i++) {
    	   if(i==6) {
    		   continue;
    	   }
    	   hap +=jumin[i]*cre;
    	   cre++;
    	   /*
    	    * hap =0 
    	    * hap += 주민번호 첫번째 자리 (1) *2
    	    *  hap += 주민번호 첫번째 자리 (2) *3
    	    *  hap += 주민번호 첫번째 자리 (3) *4
 			*  hap += 주민번호 첫번째 자리 (4) *5
 			*  hap += 주민번호 첫번째 자리 (5) *6
 			*  hap += 주민번호 첫번째 자리 (6) *7
 			*  -는 읽지 않음 
 			*  hap += 주민번호 첫번째 자리 (a) *8// 성별 
 			*  hap += 주민번호 첫번째 자리 (b) *9// 등록지역
 			*  hap += 주민번호 첫번째 자리 (c) *2// 구, 군
    	    *  hap += 주민번호 첫번째 자리 (d) *3/  구, 군
    	    *  hap += 주민번호 첫번째 자리 (e) *4// 해당 구 군의 동 읍 면
    	    *  hap += 주민번호 첫번째 자리 (f) *5// 
    	    * 
    	    * 
    	    * */
    	   if (cre == 10) {
    		   cre =2; 
    	   } 
       }
       
       
       temp = (int)(hap/11.f) * 11.0f + 11.0f - hap;
       temp1 = temp - (int)(temp/10.f) *10.0f;  // 13번과 맞으면 일치 / 맞지 않으면 불일치 
       
       if(temp1 != jumin[13]) {
    	   System.out.println("주민번호가 검증된 수가 올바르지 않습니다.");
    	   continue;
       }
       	
       
       right = true; 
       }while(!right); // 주민등록번호 검증 
      
      //결과 출력 
      System.out.println();
      System.out.println("이름 :"+name );
      System.out.print("주민번호 :" );
      for (int i = 0; i < jumin.length; i++) {
    	  if (i == 6) {
    		 System.out.print("-");
    		 continue;
    	  }
    	  System.out.print(jumin[i]);
      }
      
     System.out.println();
      System.out.println("생년월일 : ");
      int year= 0, month=0, day = 0;
      switch (jumin[7]) {
      case 9:
      case 0:
    	  year = 1800;
    	  break;
      case 1:
      case 2:
    	  year = 1900;
    	  break;
      case 3:
      case 4:
    	  year =2000;
    	  break;
      }
      
      year += jumin[0]*10 +jumin[1];
      month = jumin[2]*10 +jumin[3];
      day = jumin[4]*10 +jumin[5];
      
      System.out.println(year + "년"+month +"월"+day + "일");
      System.out.print("성별 : ");
      System.out.println(jumin[7] %2 ==0 ? "여성" : "남성");
      System.out.print("태어난 시, 도 : ");
      String area ="";
      
      switch(jumin[8]) {
      case 0: 
    	  area = "서울";
    	  break;
      case 1: 
    	  area = "경기, 인천";
    	  break;
      case 2: 
    	  area = "부산";
    	  break;
      case 3: 
    	  area = "강원";
    	  break;
      case 4: 
    	  area = "충청";
    	  break;
      case 5: 
    	  area = "전라도";
    	  break;
      case 6: 
    	  area = "대구, 광주";
    	  break;
      case 7: 
    	  area = "경북 경남";
    	  break;
      case 8: 
    	  area = "경남 ";
    	  break;
      case 9: 
    	  area = "제주도";
    	  break;

      }
      System.out.println(area);
      
      // 나이 출력할때  java.util.Calendar 
      System.out.println("나이 : ");
      Calendar ca = Calendar.getInstance();
      int age = ca.get(Calendar.YEAR) - year +1;
      System.out.println(age + "세");
    	
      
      
      
	}

}



















