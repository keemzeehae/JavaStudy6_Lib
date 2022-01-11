package com.jihye.s1.lang.wrapper;

public class WrapperMain {

	public static void main(String[] args) {
		
		int num =10;
		Integer n = Integer.valueOf(num);
		num = n.intValue();
		n=num;//AutoBoxing
		num=n;//AutoUnboxing
		
		double d = 3.14;
		Double dd = d;
		d=dd;
		int n2 = (int)d;
		
		String nums = "3.14";
		double check = Double.parseDouble(nums);
		
		System.out.println(check+1.2);
		
//		System.out.println(Integer.BYTES); //클래스명.변수명
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.SIZE);
//		System.out.println(Long.BYTES);

	}

}
