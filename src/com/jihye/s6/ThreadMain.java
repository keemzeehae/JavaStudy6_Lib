package com.jihye.s6;

public class ThreadMain {

	public static void main(String[] args) {
		Thread1 t1 =new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();
		//스타트 클래스는 쓰레드 안에 선언된 메서드라 쓸 수 있음
		// 쓰레드로 쓰려면 위임을 해줘야함
		// 쓰레드는 운영체제 마음대로 번갈아가면서 실행시켜줌
		

	}

}
