package 선택제어문.자가진단02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int height, weigh;		
		Scanner sc = new Scanner(System.in);
		height = sc.nextInt();
		weigh = sc.nextInt();
		int obe = weigh + 100 - height;
		if(obe < 0) {
			System.out.println(obe);			
		} else {
			System.out.println(obe);
			System.out.println("Obesity");
		}
		sc.close();
		
	}

}
