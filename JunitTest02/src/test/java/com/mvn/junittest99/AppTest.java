package com.mvn.junittest99;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest 
{
	// 실습1
    @Test
    public void test1() {
    	App app = new App();
    	int[][] arr = new int[][] {
    		{1, 4, 5, 7, 9, 11},
    		{10, 14, 20, 319},
 			{1, 60, 10, 12, 95, 1212},
 			{11, 5, 0, -222, 1231},
 			{12312, 523, -34523, 12312, 55555, 6123}
    	};
    	for(int i = 0; i < 5; i++) {
    		int [] arr1 = new int [arr[i].length];
    		for(int j = 0; j < arr[i].length; j++) {
    			arr1[j] = arr[i][j]; 
    		}
    		app.sortArr(arr1);
    		assertArrayEquals(arr[i], arr1);
    		//assertEquals(Arrays.toString(arr[i]), Arrays.toString(arr1));
    		System.out.println((i + 1) + "번째 int[]은 오름차순입니다.");
    	}
    }
    
    // 실습2
    @Test
    public void test2() {
    	String result = "";
    	App app = new App();
    	int[][] arr = new int[][] {
    		{1, 4, 5, 7, 9, 11},
    		{10, 14, 20, 319},
 			{1, 60, 10, 12, 95, 12},
    	};
    	for(int i = 0; i < 3; i++) {
    		int max = app.max(arr[i]);
    		int min = app.min(arr[i]);
    		if(i == 0) {
    			assertEquals(11, max);
    			System.out.println((i + 1) + "번째 int[]의 최대 값은" + max);
    			assertEquals(1, min);
    			System.out.println((i + 1) + "번째 int[]의 최소 값은" + min);
    		} else if(i == 1) {
    			assertEquals(319, max);
    			System.out.println((i + 1) + "번째 int[]의 최대 값은" + max);
    			assertEquals(10, min);
    			System.out.println((i + 1) + "번째 int[]의 최소 값은" + min);
    		} else {
    			assertEquals(95, max);
    			System.out.println((i + 1) + "번째 int[]의 최대 값은" + max);
    			assertEquals(1, min);
    			System.out.println((i + 1) + "번째 int[]의 최소 값은" + min);
    		}
    		result += (i + 1) + "번째 int[]의 최대 값은" + max + "\n";
    		result += (i + 1) + "번째 int[]의 최소 값은" + min + "\n";
    	}
    }
    
	@BeforeClass
	public void makeDir() {
		File a = new File("C:/Users/YunBul/Desktop/Dropbox/Java02/JavaWork/JunitTest02/TEST");
	}
    
}
