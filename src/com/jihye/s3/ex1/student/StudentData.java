package com.jihye.s3.ex1.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.jihye.s3.ex1.member.MemberDTO;

public class StudentData {
	
	private Scanner sc;
	
	public StudentData() {
		sc = new Scanner(System.in);
		
	}
	
	public Map<String, StudentDTO> addStudent(List<MemberDTO> ar){
		
		//키보드로부터 member의 수만큼 성적 정보 입력
		//이정보들을 StudentDTO 객체 
		//map의 키는 id
		
		HashMap<String, StudentDTO> map = new HashMap<>();
		
		for(int i=0;i<ar.size();i++) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setId(ar.get(i).getId());
			//name
			studentDTO.setName(ar.get(i).getId());
			System.out.println("국어성적입력");
			studentDTO.setKor(sc.nextInt());
			System.out.println("영어성적입력");
			studentDTO.setEng(sc.nextInt());
			System.out.println("수학성적입력");
			studentDTO.setMath(sc.nextInt());
			
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			map.put(studentDTO.getId(), studentDTO);
			
		}
		return map;
		
	}
	


}
