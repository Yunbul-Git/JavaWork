package 반복제어문2.형성평가08;

//행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.
//입력 예
//3 4
//출력 예 
//1 2 3 4
//2 4 6 8
//3 6 9 12
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		i = sc.nextInt();
		j = sc.nextInt();
		for (int n = 1; n <= i; n++) {
			for (int m = 1; m <= j; m++) {
				System.out.print(n*m + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}