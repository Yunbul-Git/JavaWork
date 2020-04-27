package 선택제어문.형성평가04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
		int x = sc.nextInt();
		if (x == 1) {
			System.out.println("Number? dog");
		} else if (x == 2) {
			System.out.println("Number? cat");
		} else if (x == 3) {
			System.out.println("Number? chick");
		} else {
			System.out.println("Number? I don't know.");
		}
		sc.close();
	}

}
