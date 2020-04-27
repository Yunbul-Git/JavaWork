package com.lec.java.regexp04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 정규표현식 연습
 * 
 * 이번에 우리 쇼핑몰에서 할인 쿠폰을 발행하려 한다.
 * 발행되는 쿠폰의 일련번호 형식은 다음과 같다.
 * 
 *    알파벳두자리-숫자4자리-숫자3자리-알파벳3자리 
 * 
 * 알파벳은 대소문자 구문 없슴
 * 숫자는 0으로 시작하면 안됨.
 * 사용자는 발급받은 쿠폰번호를 입력해야 하는데, 
 * 위와 같은 형식만 받아들일수 있도록 만들자
 * 
 * 허용예]
 * 	Ab-7890-786-zuy
 * 	ki-2010-893-Zip
 * 
 * 불가]
 * 	xX-1200-089-zuy
 * 	p9-324-089-zopl
 * 
 *  쿠폰번호를 계속해서 입력 받으면서 
 * "유효한 쿠폰입니다"  혹은 "유효한 쿠폰이 아닙니다" 판정결과를 출력
 * 
 * 'quit' 입력하면 프로그램 종료

 */

public class RegExp04Main {

	public static void main(String[] args) {
		System.out.println("정규표현식 예제");
		Scanner sc = new Scanner(System.in);
		while (true) {
			String coupon = sc.next();
			if (coupon.equals("quit")) {
				break;
			} else {
				String regex1 = "[a-zA-z]+";
				Matcher matcher1 = Pattern.compile(regex1).matcher(coupon);
				while (matcher1.find()) {
					if (matcher1.start() == 0 && matcher1.end() == 2) {
						String regex2 = "[1-9]+";
						Matcher matcher2 = Pattern.compile(regex2).matcher(coupon);
						while (matcher2.find())
							if (matcher2.start() == 3 && matcher2.end() == 7) {
								String regex3 = "[-]";
								Matcher matcher3 = Pattern.compile(regex3).matcher(coupon);
								while (matcher3.find())
									if (matcher3.start() == 2) {
										break;
									} else if (matcher3.start() == 7) {
										break;
									} else if (matcher3.start() == 11) {
										break;
									} else
										System.out.println("유효한 쿠폰이 아닙니다");
							} else if (matcher2.start() == 8 && matcher2.end() == 11) {
								String regex3 = "[-]";
								Matcher matcher3 = Pattern.compile(regex3).matcher(coupon);
								while (matcher3.find())
									if (matcher3.start() == 2) {
										break;
									} else if (matcher3.start() == 7) {
										break;
									} else if (matcher3.start() == 11) {
										break;
									} else
										System.out.println("유효한 쿠폰이 아닙니다");
							} else {
								System.out.println("유효한 쿠폰이 아닙니다");
							}
					} else if (matcher1.start() == 12 && matcher1.end() == 15) {
						String regex2 = "[1-9]+";
						Matcher matcher2 = Pattern.compile(regex2).matcher(coupon);
						while (matcher2.find())
							if (matcher2.start() == 3 && matcher2.end() == 7) {
								String regex3 = "[-]";
								Matcher matcher3 = Pattern.compile(regex3).matcher(coupon);
								while (matcher3.find())
									if (matcher3.start() == 2) {
										break;
									} else if (matcher3.start() == 7) {
										break;
									} else if (matcher3.start() == 11) {
										break;
									} else
										System.out.println("유효한 쿠폰이 아닙니다");
							} else if (matcher2.start() == 8 && matcher2.end() == 11) {
								String regex3 = "[-]";
								Matcher matcher3 = Pattern.compile(regex3).matcher(coupon);
								while (matcher3.find())
									if (matcher3.start() == 2) {
										break;
									} else if (matcher3.start() == 7) {
										break;
									} else if (matcher3.start() == 11) {
										break;
									} else
										System.out.println("유효한 쿠폰이 아닙니다");
							} else {
								System.out.println("유효한 쿠폰이 아닙니다");
							}
					} else {
						System.out.println("유효한 쿠폰이 아닙니다.");
					}
//					System.out.println(matcher.group());
//					System.out.println(matcher.end());
				}
			}

		}
		System.out.println("프로그램 종료");
		sc.close();
	} // end main
} // end class
