package com.lec.java.inherit07;

public class Business extends Person {
	private String company;

	public String getCompany() {return company;}
	public void setCompany(String company) {this.company = company;}
	
	//메소드 재정의
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("회사 : " + company);
	}
	public void showInfo(int id) {
		System.out.println("id : " + id);
		showInfo();
	}
//	@Override
//	public void whoAreYou() {
//		// TODO Auto-generated method stub
//		super.whoAreYou();
//	}
	@Override
	public String toString() {
		return "BusinessPerson : " + getName() + " " + company;
	}
}
