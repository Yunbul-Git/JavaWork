package com.lec;

import java.util.Scanner;

public class examples {

	public static void main(String[] args) {
		System.out.println("This is examples");
		Scanner sc = new Scanner(System.in);

		int num1, num3, num4 = 0;
		int num2 = 0, gauge = 0;

		for (num3 = 500; num3 > 0;) {
			System.out.println("1, 2, 3, 4 중 하나를 입력하세요");
			num1 = sc.nextInt();
			if (num1 == 1 && num2 != 1) {
				num2 = num1;
				gauge = gauge + 5;
				num3 = num3 - 2;
				num4 = num4 + 1;
				if (gauge >= 100) {
					gauge = 100;
				}
			} else if (num1 == 2 && num2 != 2) {
				num2 = num1;				
				gauge = gauge + 7;
				num3 = num3 - 3;
				num4 = num4 + 1;
				if (gauge >= 100) {
					gauge = 100;
				}
			} else if (num1 == 3 && num2 != 3) {
				num2 = num1;
				gauge = gauge + 10;
				num3 = num3 - 5;
				num4 = num4 + 1;
				if (gauge >= 100) {
					gauge = 100;
				}
			} else if (num1 == 4 && gauge >= 75) {
				gauge = gauge - 75;
				num3 = num3 - 13;
				num4 = num4 + 1;
				if (gauge >= 100) {
					gauge = 100;
				}
			} else if (num1 == 4 && gauge < 75) {
				System.out.println("Gauge가 모자랍니다.");
//			} else if (gauge >= 100) {
//				gauge = 100;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
			System.out.println("Gauge : " + gauge);
			System.out.println("num3 : " + num3);
		}
		System.out.println("끝!");
		System.out.println(num4 + "회 만에 끝내셨습니다!");

	}
}
