package com.jihye.s3.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

import com.jihye.s2.util.token.SeasonDTO;

public class MemberData {
	
	private String data;
	
	//기본 생성자 선언
	public MemberData() {
		this.data = "id1-pw1-name1-id1@gmail.com-12-";
		this.data = this.data+"id2-pw2-name2-name2@naver.com-42-";
		this.data = this.data+"id3-pw3-name3-name3@daum.net-19-";
		this.data = this.data+"id4-pw4-name4-name4@daum.net-17-";
		System.out.println(this.data);
	}
	//메서드
	public ArrayList<MemberDTO> init() {
//	data에 있는 문자열을 StringTokenizer로 파싱해서
//		MemberDTO를 생성해서 멤버변수값으로 대입
//		MemberDTO들을 ArrayList에 담아서 리턴
		StringTokenizer st = new StringTokenizer(data,"-");
		ArrayList<MemberDTO> ar = new ArrayList<>();
		while (st.hasMoreTokens()) {
			SeasonDTO seasonDTO = new SeasonDTO();
			String token = st.nextToken().trim();
			seasonDTO.setName(token);
		}
		
	
		
		return null;
		
	}
}
