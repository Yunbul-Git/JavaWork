package 배열1.자가진단09;

import java.lang.reflect.Array;
// 입력 예
// 95 100 88 65 76 89 58 93 77 99
// 출력 예
// 100 99 95 93 89 88 77 76 65 58
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sw;
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i = arr.length; i > 0; i--) {
			if (arr[i] > arr[i + 1]) {
				sw = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = sw;

			}
		}

	}

}