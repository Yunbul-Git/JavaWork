package com.lec.java.test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 0;
		while(true) {
			int num = sc.nextInt();
			if(num == 0) {break;}
			if(max == 0) {max = num;}
			if(min == 0) {min = num;}
			if(max < num) {max = num;}
			if(min > num) {min = num;}
			}//end while
		System.out.println(max + " " + min);
	}//end main

}//end class
