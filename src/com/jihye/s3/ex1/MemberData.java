package com.jihye.s3.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.jihye.s2.util.token.SeasonDTO;

public class MemberData {
	
	private String data;
	private Scanner sc;
	
	
	//기본 생성자 선언
	public MemberData() {
		this.sc= new Scanner(System.in);
		this.data = "id1-pw1-name1-id1@gmail.com-12-";
		this.data = this.data+"id2-pw2-name2-name2@naver.com-42-";
		this.data = this.data+"id3-pw3-name3-name3@daum.net-19-";
		this.data = this.data+"id4-pw4-name4-name4@daum.net-17-";
		System.out.println(this.data);
	}
	public MemberDTO removeMember(ArrayList<MemberDTO> ar) {
		//삭제하고 싶은 ID입력받아서 ArrayList에서 삭제
		
		MemberDTO memberDTO= null;
		System.out.println("ID를 입력하세요.");
		String id = sc.next();
		for (int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i).getId());
			if(ar.get(i).equals(id)) {
				memberDTO = ar.remove(i);
				break;
				
			}
			
		}return memberDTO;
	}
	public void addMember(ArrayList<MemberDTO> ar) {
		MemberDTO m1 = new MemberDTO();
		System.out.println("id를 입력하세요.");
		m1.setId(sc.next());
		System.out.println("pw를 입력하세요.");
		m1.setPw(sc.next());
		System.out.println("이름을 입력하세요.");
		m1.setName(sc.next());
		System.out.println("email을 입력하세요.");
		m1.setEmail(sc.next());
		System.out.println("나이를 입력하세요.");
		m1.setAge(sc.nextInt());
		
		ar.add(m1);
		
		//키보드로부터 id,pw,name,email,age입력 받아서 MemberDTO의 멤버변수 값으로 대입
		//매개변수로 받은 ar에 MemberDTO 추가 
		
		
	}
	//메서드
	public ArrayList<MemberDTO> init() {
//	data에 있는 문자열을 StringTokenizer로 파싱해서
//		MemberDTO를 생성해서 멤버변수값으로 대입
//		MemberDTO들을 ArrayList에 담아서 리턴
		StringTokenizer st = new StringTokenizer(data,"-");
		ArrayList<MemberDTO> ar = new ArrayList<>();
		while (st.hasMoreTokens()) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(st.nextToken().trim());
			memberDTO.setPw(st.nextToken().trim());
			memberDTO.setName(st.nextToken().trim());
			memberDTO.setEmail(st.nextToken().trim());
			memberDTO.setAge(Integer.parseInt(st.nextToken().trim()));
			
			
		}
		
	
		
		return ar;
		
	}
}
