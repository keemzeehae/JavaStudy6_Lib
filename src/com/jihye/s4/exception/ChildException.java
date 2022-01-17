package com.jihye.s4.exception;

public class ChildException extends Exception {
	//예외클래스
	public ChildException() {}
	
	public ChildException(String message) {
		//부모생성자를 호출하는 super(); 가 생략되어있음
		super(message);
	}

}
