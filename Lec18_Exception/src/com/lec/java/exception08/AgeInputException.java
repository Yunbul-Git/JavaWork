package com.lec.java.exception08;

// TODO : Exception 상속받은 예외 클래스 만들기
public class AgeInputException extends Exception{

	public AgeInputException() {
		super("올바른 나이 입력이 아닙니다");

	}
	public AgeInputException(String msg) {
		super(msg);
	}
} // end class AgeInputException
