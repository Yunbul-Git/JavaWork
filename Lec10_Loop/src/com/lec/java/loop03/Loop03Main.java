package com.lec.java.loop03;

public class Loop03Main {

	public static void main(String[] args) {
		System.out.println("중첩 for 문 nested for");

		// 구구단 출력 : 중첩 for 사용
		int i, j;
		for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);

			}
			System.out.println("----------");
		}
		System.out.println();
		// 구구단 출력 : 중첩 while 문 사용
		int a = 2, b = 1;
		while (a <= 9) {
			System.out.println(a + "단");
			while (b <= 9) {
				System.out.println(a + " * " + b + " = " + a * b);
				b++;
			}
			a++;
			b = 1;
			System.out.println();
		}
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class
