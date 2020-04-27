package 반복제어문1.자가진단02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while (num >= 0) {
			sum += num;
			num--;
		}
		System.out.println(sum);
		sc.close();
	}

}
