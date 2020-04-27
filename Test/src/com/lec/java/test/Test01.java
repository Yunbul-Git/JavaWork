package com.lec.java.test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		double sum = 0;
		double cross = 0;
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sum = a + b;
		cross = a * b;
		
		System.out.println(sum);
		System.out.printf("%.1f",cross);
	} // end main

} // end class
