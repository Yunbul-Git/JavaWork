package com.lec.java.collection03;

import java.util.ArrayList;

public class Collection03Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");

		// Student 타입을 담는 ArrayList를 만드고
		// 사용자로부터 3개의 Student 데이터 을 입력받아서
		// (id, name, kor, eng, math)
		// 3가지 방법으로 출력해보세요.
		// for, Enhanced-for, Iterator
		ArrayList<Student> student1 = new ArrayList<Student>();
		int id = 0;
		String name = "H";
		int kor = 90;
		int eng = 80;
		int math = 70;
		Student s1 = new Student(id, name, new Score(kor, eng, math));	
		
		student1.add(s1);
		
		System.out.println(s1);
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class
