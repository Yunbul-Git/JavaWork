package com.lec.java.input;

import java.util.Scanner;

/*
 * 표준 입력(Standard Input) : 키보드로부터 입력
 * 		  Scanner 객체 사용
 * 
 * 표준 출력(Standard Output) : 모니터로 출력
 */
public class Input01Main {

	public static void main(String[] args) {
		System.out.println("표준입력 : Scanner 사용");
		
		Scanner sc = new Scanner(System.in); // import 필요, Scanner 객체 생성
		
//		Scanner 사용한 입력 작업
		int num1, num2;
		System.out.print("숫자1을 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.print("숫자2을 입력하세요 : ");
		num2 =sc.nextInt();
		
		
		
//		System.out.println("num1 = " + num1);
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // println 으로 쓸 때.
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2); // printf 로 쓸 때. 
//		 nextInt() 에서 Int가 아닌 것을 입력하면 InputMismatch error 발생.
		
// 		각 primitive 타입에 대해 nextXXX() 메소드 제공
//		sc.nextByte();
//		sc.nextShort();
//		sc.nextLong();
//		sc.nextFloat();
//		sc.nextDouble();
//		sc.nextBoolean();


		
		
		sc.close(); // Scanner 객체를 사용한 뒤에는 반드시 close()를 해줘야함.

	}

}
