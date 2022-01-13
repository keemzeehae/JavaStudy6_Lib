package com.jihye.s3.ex1.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.jihye.s3.ex1.member.MemberDTO;
import com.jihye.s3.ex1.member.MemberData;

public class StudentData {

	private Scanner sc;

	public StudentData() {
		sc = new Scanner(System.in);
	}

	public Map<String, StudentDTO> addStudent(List<MemberDTO> ar) {
		// 키보드로부터 member의 수만큼 성적 정보입력 ar 에서 출석부에서 사람이름 가지고 와서 student 성적 정보 입력해놓음
		// 이 정보들을 StudentDTO
		// map의 키는 id
		MemberDTO memberDTO = new MemberDTO();

		System.out.println("아이디를 입력해주세요");
		String id = sc.next();
		System.out.println(id);
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < ar.size(); i++) {
			StudentDTO studentDTO = new StudentDTO();
			
			System.out.println(ar.get(i).getId());
			
			if (ar.get(i).getId().equals(id)) {
				System.out.println("정보있음");
				ArrayList<StudentDTO> studentInfo = new ArrayList<>();
				//id 
				//name
				System.out.println("국어성적을 입력하세요");
				studentDTO.setKor(sc.nextInt());
				System.out.println("영어성적을 입력하세요");
				studentDTO.setEng(sc.nextInt());
				System.out.println("수학성적을 입력하세요");
				studentDTO.setMath(sc.nextInt());
				//총점
				//평균
				studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
				studentDTO.setAvg(studentDTO.getTotal()/3.0);
				System.out.println("총점 : "+studentDTO.getTotal());
				System.out.println("평균 : "+studentDTO.getAvg());
				studentInfo.add(studentDTO);
				
				//맵에 추가
				
				map.put(studentDTO.getId(), studentDTO);
				
				break;
			}

		}
		return map;

	}
}
