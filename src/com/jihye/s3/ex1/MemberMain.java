package com.jihye.s3.ex1;

public class MemberMain {

	public static void main(String[] args) {
		// test하고 싶을때 프로그램을 실행하는 역할 main method
		MemberData memberData = new MemberData();
		MemberDTO [] members = memberData.init();
		
		for (int i =0; i<members.length;i++) {
			System.out.println(members[i].getId());
			System.out.println(members[i].getPw());
			System.out.println(members[i].getName());
			System.out.println(members[i].getEmail());
			System.out.println(members[i].getAge());
			System.out.println("=========================");
		}
		System.out.println("name: "+"jh"+"age: "+30);

	}

}
