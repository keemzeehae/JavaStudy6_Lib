package com.jihye.s4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExStudy1 {
	
		//여러개를 한꺼번에 던짐
		public void ex1() throws InputMismatchException, ArithmeticException, Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력");
		int num = sc.nextInt();
		//throw new InputMismatchException();
		
		int num2 = 10;
		
		int num3 = num2/num;
		//throw new ArithMathicException();
		
		System.out.println(num3);
		}
	

}
