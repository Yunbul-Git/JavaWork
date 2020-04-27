package com.lec.java.array04;

import java.util.Scanner;

/* 연습
 * 길이 5개 int형 배열을 선언하고
 * 사용자로부터 5개 정수를 입력받아 초기화 한뒤 
 * 
 * 총점, 평균, 최대값, 최소값  출력해보기
 */
public class Array04Main {

	public static void main(String[] args) {
		System.out.println("배열 연습");
		int[] inte = new int[5];
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int max = 0, min = 0;
		for (int i = 0 ; i < inte.length; i++) {
		inte[i] = sc.nextInt();
		total += inte[i];		
		if (inte[i] > max) {
			max = inte[i];
		}
		}
		System.out.println(total);
		System.out.println(total / inte.length);
		System.out.println(max);
		
	} // end main()

} // end class Array04Main
