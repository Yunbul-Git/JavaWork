package 선택제어문.자가진단07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String eng;
		eng = sc.next();
		if (eng.equals("A")) {
			System.out.println("Excellent");
		} else if (eng.equals("B")) {
			System.out.println("Good");
		} else if (eng.equals("C")) {
			System.out.println("Usually");
		} else if (eng.equals("D")) {
			System.out.println("Effort");
		} else if (eng.equals("F")) {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}
		sc.close();
	}

}
