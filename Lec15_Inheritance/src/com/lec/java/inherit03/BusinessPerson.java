package com.lec.java.inherit03;

// 하나의 class에서만 상속 받을 수 있다.
public class BusinessPerson extends Person {
	String company;
	public void showInfo() {
		whoAmI();
		System.out.println("회사는 " + company + "입니다");
	}
}
