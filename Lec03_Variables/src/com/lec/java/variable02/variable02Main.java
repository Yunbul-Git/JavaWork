package com.lec.java.variable02;

//자바의 기본 자료형(primitive data type)
//정수 타입: byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
//실수 타입: float(4바이트), double(8바이트)
//문자 타입: char(2바이트)
//논리 타입: boolean

public class variable02Main {

	public static void main(String[] args) {
		System.out.println("정수타입 변수들");
		System.out.println("byte: "+ Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		byte num1 = -128;
		byte num2 = 0;
		byte num3 = 123;
//		byte num4 = 128; // error : byte 에 저장 할 수 있는 크기를 넘어섬. Type mismatch
		
		System.out.println("short: "+ Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		short num5 = -12345;
		short num6 = 12345;
//		short num7 = 32768;
//		short num8 = -32769;
		
		System.out.println("int: "+ Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long: "+ Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
//		int num9 = 9876543210;
//		long num10 = 9876543210; // literal 9876543210 of type int is out of range
//		리터럴 = 코드상에 직접 입력한 값들.
//		정수 리터럴 --> int로 형변환 하려고 함.
//		실수 리터럴 --> double로 형변환 하려고 함.
//		"" 리터럴 --> string으로 형변환 하려고 함.

		long num11 = 9876543210L; // 마지막에 L을 써서 long형 리터럴로 인식하도록 함.
		long num12 = 12;
		long num13 = 12L;
		int num14 = 12;
//		int num15 = 12L; // long 타입을 int에 대입 불가.
		
//		값의 경계선
		byte num15 = Byte.MAX_VALUE; // 127
		byte num16 = (byte)(num15 + 1); // 형변환
		System.out.println("num15 = " + num15); // 127
		System.out.println("num16 = " + num16); // -128
//		값이 순환함..
		
//		정수 표기법
		int number1 = 11; // 10진법 (Decimal)
		int number2 = 0xB; // 16진법 (Hexadecimal) , 0x로 시작
		int number3 = 013; // 8진법 (Octal) : 0으로 시작
		int number4 = 0b1011; // 2진법 (Binary) : 0b로 시작
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		System.out.println("number3 = " + number3);
		System.out.println("number4 = " + number4);
//		string.format()을 사용하여 원하는 포멧(진법)으로 출력가능
		System.out.println("number1 = " + String.format("%x", number1));
		System.out.println("number1 = " + String.format("%o", number1));
//		integer.to???(n)을 사용하여 원하는 포멧의 문자열로 변환 가능
		System.out.println("number1 = " + Integer.toHexString(number1));
		System.out.println("number1 = " + Integer.toOctalString(number1));
		System.out.println("number1 = " + Integer.toBinaryString(number1));
		
		
		
	}

}
