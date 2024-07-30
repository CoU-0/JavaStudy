package com.absex;

public class UseDraw {

	public static void main(String[] args) {
	
		Diagram[] dia= new Diagram[3];
		dia[0]=new Triangle();
		dia[1]=new Circle();
		dia[2]=new Rectangle(); 
		
	//	Diagram dd=new Circle(); // 다형성
		 for(int i=0; i<dia.length;i++)
			 dia[i].draw();
		 

	}

}
