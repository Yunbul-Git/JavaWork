package practice.stddev;

import java.util.Scanner;

public class StdDev {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int[] nums = {sc.nextInt()};
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("평균 : " + calcAvg(nums));
		System.out.println("분산 : " + calcVariance(nums));
		System.out.println("표준편차 : " + calcStdDev(nums));
		// 임의정수 5개로 초기화한 정수로
		// 평균, 분산, 표준편차 구하기

	} // end main

	/**
	 * 메소드 이름 : calcAvg 매개변수 : int [] 리턴값 : double
	 * 
	 * 주어진 배열의 '평균값' 리턴
	 */
	public static double calcAvg(int[] numbers) {
		double avg = 0;
		double nums = 0;
		for (int i = 0; i < numbers.length; i++) {
			nums += numbers[i];
		}
		avg = nums / numbers.length;
		return avg;
	}

	/**
	 * 메소드 이름 : calcVariance 매개변수 : int [] 리턴값 : double
	 * 
	 * 주어진 배열의 '분산값' 리턴
	 */
	public static double calcVariance(int[] numbers) {
		double avg = calcAvg(numbers);
		double var = 0;
		for (int i = 0; i < numbers.length; i++) {
			var += ((numbers[i] - avg) * (numbers[i] - avg) / numbers.length);
		}
		return var;
	}

	/**
	 * 메소드 이름 : calcStdDev 매개변수 : int [] 리턴값 : double
	 * 
	 * 주어진 배열의 '표준편차' 리턴
	 */
	public static double calcStdDev(int[] numbers) {
		double dev = 0;
		double avg = calcAvg(numbers);
		for (int i = 0; i < numbers.length; i++) {
			dev += (Math.sqrt((numbers[i] - avg) * (numbers[i] - avg) / numbers.length));
		}
		return dev;
	}
} // end class
