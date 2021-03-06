package com.lec.java.oop05;

/*
 인터페이스(interface):
 1. 모든 메소드가 public abstract으로 선언되고,
 2. 모든 멤버 변수가 public static final로 선언된
 특별한 종류의 추상 클래스

 인터페이스는 interface라고 선언
 인터페이스를 구현(상속)하는 클래스에서는 implements 키워드를 사용
 인터페이스를 구현(상속)할 때는 개수 제한이 없다. 다중 상속 허용!
 메소드 선언에서 public abstract는 생략 가능
 멤버 변수 선언에서 public static final은 생략 가능
*/

public class Interface01Main {

	public static void main(String[] args) {
		System.out.println("인터페이스(interface)");

		// TestInterface t1 = new TestInterface(); // 추상 메소드를 가지고 있으면 new 불가능

		TestImpl test1 = new TestImpl();
		test1.testAAA();
		test1.testBBB();
		
		TestImpl2 test2 = new TestImpl2();
		
		System.out.println(test1.MIN);
		//System.out.println(test2.MIN);
		System.out.println(TestInterface.MIN);
		System.out.println(TestInterface2.MIN);
		
		System.out.println("\n 프로그램 종료");
	} // end main()

} // end class

interface TestInterface {

	// 모든 멤버 변수가 public static final 변수여야 한다.
	public static final int MIN = 0;
	int MAX = 100; // public static final(생략 가능) 변수임.
	public static final String JAVA_STRING = "Java";
	String KOTLIN_STRING = "Kotlin";

	// 모든 메소드는 public abstract
	public abstract void testAAA();

	void testBBB(); // public abstract 생략 가능

}

interface TestInterface2 {
	public static final int MIN = 1;

	public abstract void testAAA();

	public abstract void testCCC();

}

// 인터페이스는 인스턴스를 생성 할 수 없고
// 다른 클래스에서 구현(implement)해야한다.
class TestImpl implements TestInterface {

	@Override
	public void testAAA() {
		System.out.println("AAA");

	}

	@Override
	public void testBBB() {
		System.out.println("BBB");

	}

}

// 인터페이스는 다중상속이 가능하다.

class TestImpl2 implements TestInterface, TestInterface2 {

	@Override
	public void testCCC() {
		System.out.println("CCC");		
	}

	@Override
	public void testAAA() {
		System.out.println("AAA");
	}

	@Override
	public void testBBB() {
		System.out.println("BBB");
	}

}