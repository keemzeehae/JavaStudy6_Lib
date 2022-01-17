package com.jihye.s4.exception;

public class ExStudy2 {
	
	public void ex1() {
		
		//유치원생 - 2자릿수까지 읽기 가능
		int num = 50;
		int num2= 10;
		int num3 = num +num2;
		int num4 = num2 - num;
		
		try {
		
		if (num3>99) {
			throw new ChildException("3자리수 몰라요");
			
			}
		if(num4 <0) {
			throw new ChildException("그런거 몰라요");
		}
		
		}catch(Exception exception) {
//		catch(ChildException childException) {
//		위에도 가능함	
//		}
		exception.printStackTrace();
		System.out.println("Messgae: "+exception.getMessage());
		}
	}

}
