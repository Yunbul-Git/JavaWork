package 반복제어문1.형성평가01;

// 정수를 입력받아 1부터 입력받은 정수까지를 차례대로 출력하는 프로그램을 작성하시오.
// 입력예
// 5
// 출력예
// 1 2 3 4 5
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 0) {
			for (int i = 0; i <= (num - 1); i++) {
				System.out.print((i + 1) + " ");
			}
		} else {
			for (int i = (num - 1); i <= 0; i++) {
				System.out.print((i + 1) + " ");
			}

		}
		sc.close();
	}
}
