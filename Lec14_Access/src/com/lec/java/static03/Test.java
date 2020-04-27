package com.lec.java.static03;

public class Test {
	private int num;
	
	static int cnt = 0;
	// Singleton 패턴 (인스턴스를 단 하나만 만들 수 있게 하는 방법?)
	// 디폴트 생성자
	private Test() {
		cnt++;
		System.out.println(cnt + "번째 인스턴스 생성");
	}
	
	private static Test instance = null;
	public static Test getInstance() {
		if(instance == null) {
			instance = new Test();
		}
		return instance;
	}
	
	
	
	
	// getter & setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
