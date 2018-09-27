package com.Hsbcnet.Testcases;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("project started");
		
		Login l = new Login();
		l.sde3Login();
	
		PriorityPayment pp = new PriorityPayment();
		pp.MXCorePP();
		
		l.Logout();
	}

}
