package com.lec.java.collection04;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection04Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");

		ArrayList<MemberModel> member = new ArrayList<MemberModel>();
//		String id = "id";
//		String pw = "pw";	
		MemberModel m1 = new MemberModel("id1", "pw1");
		MemberModel m2 = new MemberModel("id2", "pw2");
		MemberModel m3 = new MemberModel("id3", "pw3");

		member.add(m1);
		member.add(m2);
		member.add(m3);

		for (int i = 0; i < member.size(); i++) {
			member.get(i).displayInfo();
		}
		
		for(MemberModel e:member) {
			e.displayInfo();
		}
		
		Iterator<MemberModel> itr = member.iterator();
		
		while(itr.hasNext()) {
			itr.next().displayInfo();
		}
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class
