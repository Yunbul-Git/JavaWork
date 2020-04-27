package com.lec.java.for04;

public class For04Main {

	public static void main(String[] args) {
		System.out.println("for문 연습");
		// 1 ~ 100 중 2 와 7의 공배수만 출력
		for(int i = 1; i <= 1000 ; i++) {
			if(i % 2 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
		// 1 ~ 10 까지의 '합'을 계산
		int sum = 0;
		for(int i = 1 ; i <= 10 ; i++) {
			sum += i;
		}
		System.out.println(sum);
	} // end main ()

} // end class For04Main










