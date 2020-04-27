package 반복제어문1.형성평가03;

import java.util.Scanner;

// 0 부터 100 까지의 점수를 계속 입력받다가 범위를 벗어나는 수가 입력되면 
// 그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.
// (평균은 반올림하여 소수 첫째자리까지 출력한다.)
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num;
		int sum = 0;
		int avg = 0;
		int cnt = 0;
		num = sc.nextLine();
		String[] num1 = num.split("\\s+");
		for (int i = 0; i < num1.length; i++) {
			if(Integer.parseInt(num1[i]) <= 100) {
				sum += Integer.parseInt(num1[i]);
				cnt++;
			}
		}
		avg = sum / cnt;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		sc.close();
	}

}
