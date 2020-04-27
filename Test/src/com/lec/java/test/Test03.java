package com.lec.java.test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println("월요일");
		} else if (num == 2) {
			System.out.println("화요일");
		} else if (num == 3) {
			System.out.println("수요일");
		} else if (num == 4) {
			System.out.println("목요일");
		} else if (num == 5) {
			System.out.println("금요일");
		} else if (num == 6) {
			System.out.println("토요일");
		} else if (num == 7) {
			System.out.println("일요일");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}

	}//end main

}//end class
