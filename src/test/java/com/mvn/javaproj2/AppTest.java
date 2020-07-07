package com.mvn.javaproj2;

import org.junit.Test;

// JUnit 으로 테스트 동작시킬 클래스와 메소드는 모두 public 으로 만들자.
public class AppTest {

	private App app = new App();
	
	@Test
	public void test1() {
		if("welcome".equals(app.getWelcome())) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	
	
}
























