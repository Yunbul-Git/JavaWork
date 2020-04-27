package com.lec.java.collection07;

import java.util.HashSet;
import java.util.Iterator;

public class Collection07Main {

	public static void main(String[] args) {
		System.out.println("HashSet 연습");
		
		// String 타입을 저장할 수 있는 HashSet 를 생성하고
		// 5개 이상의 데이터는 저장, 수정, 삭제 등의 동작을 해보고,
		// iterator, enhanced-for 문을 사용해서 출력해보기
		HashSet<String> set = new HashSet<String>();
		set.add("h");
		set.add("E");
		set.add("L");
		set.add("L");
		set.add("O");
		set.add("!");
		set.add("!");
		System.out.println("h, E, L, L, O, !, ! 입력 결과");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		set.remove("!");
		System.out.println("삭제후 결과");
		itr = set.iterator();
		for(String s : set) {
			System.out.println(s);
		}
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class
















