package com.jihye.s3.ex1.member;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		// test하고 싶을때 프로그램을 실행하는 역할 main method
		MemberData memberData = new MemberData();
		ArrayList<MemberDTO> members = memberData.init();
//		memberData.addMember(members);
	    MemberDTO memberDTO = memberData.removeMember(members);
		if (memberDTO != null) {
			System.out.println("삭제성공!");
			
		}else {
			System.out.println("삭제실패!");
		}
		
		for (int i =0; i<members.size();i++) {
			System.out.println(members.get(i).getId());
			System.out.println(members.get(i).getPw());
			System.out.println(members.get(i).getName());
			System.out.println(members.get(i).getEmail());
			System.out.println(members.get(i).getAge());
			System.out.println("=========================");
		}
		System.out.println("name: "+"jh"+"age: "+23);

	}

}
