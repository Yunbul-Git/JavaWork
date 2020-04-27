package 반복제어문1.자가진단03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.println("number?");
			int num = sc.nextInt();
			if (num > 0) {
				System.out.println("positive integer");
			} else if (num < 0) {
				System.out.println("negative number");
			} else
				break;
		}
		sc.close();
	}

}
