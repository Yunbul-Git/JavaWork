package com.lec.java.while01;

/*
 	조건식이 true 인 동안 while 블럭 반복
 	
 	while(조건식 true / false){
 		.. 
 		..
 	}
 
 */
public class While01Main {

	public static void main(String[] args) {
		System.out.println("while 반복문");
		
		int count = 1;
		while(count <= 10) {
			System.out.println(count);
			count++;
		}
		
		System.out.println();
		
		// 10, 9, 8, ... 1까지 출력
		int num = 10;
		while(num >=1) {
			System.out.println(num);
			num--;
		}
	} // end main()
	
} // end class While01Main









