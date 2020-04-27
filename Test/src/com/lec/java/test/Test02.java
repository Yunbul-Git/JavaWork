package com.lec.java.test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hello = sc.nextLine();
		String perfect = sc.nextLine();
		String java = sc.nextLine();
		
		System.out.print(hello.substring(0,1));
		System.out.print(perfect.substring(0,1));
		System.out.print(java.substring(0,1));

	}//end main

}//end class
