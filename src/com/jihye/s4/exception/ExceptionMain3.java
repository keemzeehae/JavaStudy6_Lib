package com.jihye.s4.exception;

import java.util.InputMismatchException;

public class ExceptionMain3 {

	public static void main(String[] args) {
		ExStudy1 e1 = new ExStudy1();
		
		try {
			e1.ex1();
			
		}catch(InputMismatchException e) {
			
		}catch(ArithmeticException e) {
			
		}catch(Exception e) {
			//하나만 쓰고 싶으면 exception만 쓰는 것도 ok
			
		}
		

	}

}
