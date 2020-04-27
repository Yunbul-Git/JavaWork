package com.lec.java.input03;

import java.util.Scanner;

public class Input03Main {

	public static void main(String[] args) {
		System.out.println("nextline() vs next()");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("여러단어의 문장을 입력 > ");
		String line = sc.nextLine(); // \n 까지 전체 입력 받습니다.
		System.out.println("Line : " + line);
		
// 		next()
//		다음 단어(token)을 받아서 String으로 결과 리턴
		System.out.print("여러단어의 문장을 입력 > ");
		String token1 = sc.next();
		System.out.println("token1 : " + token1);
		
//		next()를 재차 실행하면, 버퍼에 남아있는 단어를 출력함.
		String token2 = sc.next();
		System.out.println("token2 : " + token2);
		
		String token3 = sc.next();
		System.out.println("token2 : " + token3);
		
//		nextInt(), nextDouble().. <-----next() 처럼 동작 함.
		
//		따라서 숫자 타입도 여러개를 '한줄'로 입력 받을 수 있다.
		System.out.println("숫자3개(int, double, int)를 입력받으세요 : ");
		int i1 = sc.nextInt();
		double d1 = sc.nextDouble();
		int i2 = sc.nextInt();
		
		System.out.println("i1, d1, i2 : " + i1 + "," + d1 + "," + i2);
		// 웹이나, 앱에서 입력받은 문자(사용자들이 입력하는 숫자들도) 문자열로 받음.
		
		sc.close();
	} // end main
} // end class
