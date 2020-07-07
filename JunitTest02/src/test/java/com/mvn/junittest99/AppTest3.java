package com.mvn.junittest99;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class AppTest3 {
	
	private String expected;
	private String str;
	
	public AppTest3(String expected, String str) {
		super();
		this.expected = expected;
		this.str = str;
	}

	@Parameters
	public static Collection<String[]> getTestParameters(){
		
		return Arrays.asList(new String[][] {
			{"01045372233", "010-4537-2233"},
			{"0987134","#*$()#*  0987134 !"},
			{"아 몰라 모르겠다고 !!", "addf3341 *22312"},
		});
	}
	
	// 실습 3
	@Test
	public void test3() {
		App app = new App();
		assertEquals(expected, app.toNumber(str));
		System.out.println("테스트 통과" + expected + "  " + str);
	}

}
