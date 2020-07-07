package com.mvn.javaproj2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;



public class TestJunit1 {

		@Test
		public void test() {
			int num = 5;
			String temp = null;
			String str = "안녕하세요";
			
			assertEquals("안녕하세요", str);
			assertFalse(num > 6);
			//assertFalse(num > 2);
			
			//assertNotNull(temp);	// null 이 아니면 통과
			
			assertNull(temp);
			
			//assertEquals(3.0, 12.3 / 4.1); // FAIL
			assertEquals(3.0, 12.3 / 4.1, 0.00001); // PASS
			
			
			
			
			
		}
}
