package com.interex;
/*
 * 
 * 문]
 *    성적처리 프로그램
 *    
 *    실행결과
 *    
 *    인원수 입력:2
 *    1번째 학생의 학번 이름입력(공백구분): 1111 홍길동
 *    국어 영어 수학 점수 입력 (공백구분):90 100 85
 *	   2번째 학생의 학번 이름입력(공백구분): 2222 나길동
 *    국어 영어 수학 점수 입력 (공백구분):85 70 65
 *    
 *    1111 홍길동 90 100 85 275 91 
 *                     수  수   우   
 *                     
 *  
 *   2222 나길동 :85 70 65  220  73
 *                     우  미  양   
 * 
 *
 */

//속성만 존재하는 클래스
import java.util.*;

class Record{
	String name;
	String[] scor= new String[3]; // 평가: 수 우  미  양 가
	int[]sco= new int[3];// 과목점수
	int number, avg, sum;
	
	
}


interface Sung{
	public void set();
	public void input();
	public void print();
	
}

// 인터페이스를 구현할 클래스
class SungImpl implements Sung{
	int inwon;
	Record[] re;
	
	
	
	
	@Override
	public void set() {
		Scanner sc=new Scanner(System.in);
		do {
			
			System.out.print("인원수 입력:");
			inwon=sc.nextInt();
			
		}while(1>inwon||inwon>10);
		
		re=new Record[inwon];
		
	}
	
	@Override
	public void input() {	
		//학생이름, 과목별점수입력받아 평가,총점, 평균 구함
		Scanner sc=new Scanner(System.in);
	   for(int i=0; i<re.length; i++) {
		   
		   re[i]= new Record(); //데이터가 들어갈 수 있는 공간 만들어 줌
		   
		  System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분):", i+1);
		  re[i].number=sc.nextInt();
		  re[i].name=sc.next();
		  
		   // 과목별 점수입력 
		  System.out.printf("국어 영어 수학 점수입력(공백구분):");
		  re[i].sco[0]=sc.nextInt(); 
		  re[i].sco[1]=sc.nextInt();
		  re[i].sco[2]=sc.nextInt();
		   
		  for(int j=0; j<re[i].sco.length;j++) {
			  if(re[i].sco[j]>=90) {
				  re[i].scor[j]="수";
			  }
				  
			  else if(re[i].sco[j]>=80) {
				 re[i].scor[j]="우";
			  }
				 
			  else if(re[i].sco[j]>=70) {
				  re[i].scor[j]="미";
			  }
			  else if(re[i].sco[j]>=60) {
				  re[i].scor[j]="양";
			  } else {
				  re[i].scor[j]="가";
			  }
			  
			  
			  //총점
			  re[i].sum=re[i].sco[0]+re[i].sco[1]+re[i].sco[2];
			  
			  //평균
			  re[i].avg=re[i].sum/3;
			 
			  
		  }
		   
	   }
		
	}
	
	@Override
	public void print() {
		for(int i=0; i<re.length; i++) {
			System.out.printf("%5d %7s %3d %3d %3d %3d %3d\n",re[i].number, re[i].name, re[i].sco[0],re[i].sco[1],re[i].sco[2],re[i].sum,re[i].avg);
			System.out.printf("\t\t\t%s %s %s \n",re[i].scor[0],re[i].scor[1],re[i].scor[2]);
		}
		
	}
	
}

public class InterEx03 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SungImpl s= new SungImpl();
		s.set();
		s.input();
		s.print();
		
	}

}
