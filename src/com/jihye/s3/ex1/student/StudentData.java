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

		HashMap<String, StudentDTO> map = new HashMap<>();

		for (int i = 0; i < ar.size(); i++) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setId(ar.get(i).getId());

			// id
			// name
			studentDTO.setName(ar.get(i).getName());
			System.out.println("국어성적을 입력하세요");
			studentDTO.setKor(sc.nextInt());
			System.out.println("영어성적을 입력하세요");
			studentDTO.setEng(sc.nextInt());
			System.out.println("수학성적을 입력하세요");
			studentDTO.setMath(sc.nextInt());
			// 총점
			// 평균
			studentDTO.setTotal(studentDTO.getKor() + studentDTO.getEng() + studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal() / 3.0);
			System.out.println("총점 : " + studentDTO.getTotal());
			System.out.println("평균 : " + studentDTO.getAvg());

			// 맵에 추가

			map.put(studentDTO.getId(), studentDTO);

		}

		return map;

	}
}
