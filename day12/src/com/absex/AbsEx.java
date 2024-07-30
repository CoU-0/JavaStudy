package com.absex;

public class AbsEx extends AbsEx02{

	public static void main(String[] args) {
		
		AbsEx ae= new AbsEx();
		System.out.println("ae.getA():"+ae.getA());
		System.out.println("ae.getStr():"+ae.getStr());
		

	}

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		return str;
	}

}
