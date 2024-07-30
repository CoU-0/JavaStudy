package com.starex;

public class UseGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Unit[]un = new Unit[3];
		un[0]=new Marine();
		un[1]=new SigerTank();
		un[2]=new Dropship();
		
		for(int i=0; i<un.length;i++) {
			System.out.println("============");
			un[i].move(100,200);
			un[i].message();
			System.out.println("==================");
		}
		
		
	}

}
