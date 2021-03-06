package com.lec.java.class02;

public class Class02Main {

	public static void main(String[] args) {
		System.out.println("클래스 연습");

		Circle c1 = new Circle();
		Circle c2 = new Circle(3);
		double perimeter = c1.calcPerimeter();
		System.out.println("c1의 둘레 : " + perimeter);
		perimeter = c2.calcPerimeter();
		System.out.println("c2의 둘레 : " + perimeter);
		System.out.println("c1의 면적 : " + c1.calcArea());
		System.out.println("c2의 면적 : " + c2.calcArea());
		
		System.out.println();
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2, 3);
		
		double perimeter1 = r1.calcPerimeter();
		double perimeter2 = r2.calcPerimeter();
		double area1 = r1.calcArea();
		double area2 = r2.calcArea();
		System.out.println("r1의 둘레 : " + perimeter1);
		System.out.println("r2의 둘레 : " + perimeter2);
		System.out.println("r1의 면적 : " + area1);
		System.out.println("r2의 면적 : " + area2);
		
		
		
		
		
		
		
		
		System.out.println("프로그램 종료");
	} // end main()

} // end class Class02Main
