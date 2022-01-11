package com.jihye.s1.lang.stringbuffer;

public class StringBufferMain {

	public static void main(String[] args) {
		//jh kim
		StringBuffer sb = new StringBuffer();
		sb.append("jh");
		sb.append("Kim");
		System.out.println(sb.toString());
		//String 클래스로 한다면
		String name ="jh";
		String name2 ="Kim";
		name = name+name2;
		System.out.println(name);
		name= sb.toString();
		
	}

}
