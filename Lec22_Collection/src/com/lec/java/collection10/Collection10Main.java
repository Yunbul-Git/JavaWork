package com.lec.java.collection10;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection10Main {

	public static void main(String[] args) {
		System.out.println("TreeSet 연습");

		// String 타입을 저장할 수 있는 TreeSet 인스턴스 생성
		// 5개 이상의 데이터를 저장해보고
		// 오름차순, 내림차순으로 출력해보기
		TreeSet<String> tset = new TreeSet<String>();

		tset.add("h");
		tset.add("E");
		tset.add("L");
		tset.add("L");
		tset.add("O");
		tset.add("!");
		tset.add("1");
		System.out.println("오름차순");
		for (String s : tset) {
			System.out.println(s);
		}

		System.out.println();
		System.out.println("내림차순");
		Iterator<String> itr1 = tset.descendingIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("\n프로그램 종료");
	} // end main

} // end class
