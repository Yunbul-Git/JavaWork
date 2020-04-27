package com.lec.java.inherit02;

// BasicTV
//    ┗ SmartTV
public class SmartTV extends BasicTV {
	String ip;
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("IP : " + ip);
	}
}
