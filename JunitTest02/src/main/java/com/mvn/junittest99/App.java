package com.mvn.junittest99;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    // 실습 1
    public void sortArr(int [] arr) {
    	Arrays.sort(arr);
    }
    
    // 실습 2
    public int max(int [] arr) {
    	Arrays.sort(arr);
    	return arr[arr.length];
    }
    
    public int min(int [] arr) {
    	Arrays.sort(arr);
    	return arr[0];
    }
    
    // 실습 3
    public String toNumber(String str) {
    	String result = "";
    	str.split("\\s+'.-,:`?()!;\\\"");
    	System.out.println(str);
    	return result;
    }
}
