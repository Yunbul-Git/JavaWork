package com.lec.java.collection02;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection02Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");
		// String 타입을 담는 ArrayList를 만들고
		// 5개 이상의 String을 저장하고
		// set(), remove() 등의 메소드 사용하여
		// 임의의 것을 수정, 삭제 도 해보시고
		// 3가지 방식으로 출력해보세요
		//  for, Enhanced-for, Iterator
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("h");
		list1.add("E");
		list1.add("L");
		list1.add("L");
		list1.add("O");
		list1.add("!");
		list1.add("!");		
		for(int i = 0 ; i < list1.size(); i++) {
			System.out.println(list1.get(i));			
		}
		list1.set(0, "H");
		System.out.println("Enhanced for 로 출력");
		for(String h : list1) {
			System.out.println(h);
		}
		list1.remove(5);
		System.out.println("Iterator 사용하여 출력");
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class












