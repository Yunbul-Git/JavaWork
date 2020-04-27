package 선택제어문.자가진단09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if (a < b && a < c) {
			System.out.println(a);
		} else if (b < a && b < c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
		sc.close();
	}

}
