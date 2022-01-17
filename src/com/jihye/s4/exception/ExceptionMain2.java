package com.jihye.s4.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 10;
		int result =0;
		try {
			result = num2/num1;
		} catch(Exception exception) {
			//세부적인 컨트롤 작성은 어려움
			
			exception.printStackTrace(); //exception 구문안에 꼭 이런거라도 써! 그래야 고칠 수 있음 
			//나중에 catch 구문에 아무것도 안쓰는 일이 없도록 하기
			//printStackTrace(); -> 예외가 발생한 부분 추적해줌
			
			System.out.println("0이 들어옴");
			num1 =1;
		}

		result = num2/num1;
		System.out.println(result);
	}

}
