package com.jihye.s4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepttionMain1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("나이를 입력");
		try {
		int num = 200;
		int age = sc.nextInt();//ten
//		throw new InputMismatchException(); -> 문제 발생시 자동생성 ->throw 던지면 catch에서 받아줌
		
		int result = num/age;//0
//		throw new ArithmeticException();
		
		System.out.println("Age: "+age);
		System.out.println("Result: "+result);
		} catch(InputMismatchException exception){
			System.out.println("숫자만 입력하세요");
			
		} catch(ArithmeticException exception) {
			System.out.println("0으로 나눌 수 없어요");
		} catch(Exception exception) {
			System.out.println("알수없는 예외 발생");
		} catch(Throwable exception) {
			System.out.println("모든 예외는 여기서 처리");
		}
//부모클래스로 영역을 넓혀가면서 예외를 잡아줌
	}

}
