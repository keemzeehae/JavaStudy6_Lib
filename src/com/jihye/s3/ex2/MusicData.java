package com.jihye.s3.ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MusicData {

	private String info;
	private Scanner sc;

	// 기본생성자 선언
	public MusicData() {
		this.sc = new Scanner(System.in);
		this.info = "none-crush-1-38675-";
		this.info = this.info + "SoWhat-Beenzino-2-36773-";
		this.info = this.info + "Roket-MINO-3-20784-";
		this.info = this.info + "You-The1975-4-467-";
		System.out.println(this.info);
	}
	//삭제하고 싶은 노래제목받아서 ArrayList에서 삭제
	public MusicDTO removeMusic(ArrayList<MusicDTO> ar) {
		MusicDTO musicDTO = null;
		System.out.println("삭제할 노래제목을 입력해주세요");
		String title = this.sc.next();
		System.out.println("삭제할 노래제목 확인: "+title);
		for (int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i).getTitle());
			if (title==ar.get(i).getTitle()) {
				musicDTO = ar.remove(i);
				break;
				
			}
			
		}
		
		return musicDTO;
		
	}

	// 새로 추가할 MusicDTO생성
	// 키보드로부터 title, name, rank, like 입력받아서
	// MusicDTO의 멤버변수 값으로 대입
	// 매개변수로 받은 ar에 MusicDTO추가
	public void addMusic(ArrayList<MusicDTO> ar) {
		MusicDTO musicDTO = new MusicDTO();
		System.out.println("노래제목을 입력하세요");
		musicDTO.setTitle(sc.next());
		System.out.println("가수를 입력하세요");
		musicDTO.setName(sc.next());
		System.out.println("순위를 입력하세요");
		musicDTO.setRank(sc.nextInt());
		System.out.println("좋아요수를 입력하세요");
		musicDTO.setLike(sc.nextInt());
		
		ar.add(musicDTO);

	}

	// 오늘의 음원: 제목 가수이름 랭크 좋아요수
	// 삭제하고 싶은 제목 받아서 ArrayList에서 삭제
	// info에 있는 문자열을 StringTokenizer로 파싱해서
	// MusicDTO를 생성해서 멤버변수값으로 대입
	// MusicDTO들을 ArrayList에 담아서 리턴
	public ArrayList<MusicDTO> init() {
		StringTokenizer st = new StringTokenizer(this.info, "-");
		ArrayList<MusicDTO> ar = new ArrayList<>();

		while (st.hasMoreElements()) {
			MusicDTO musicDTO = new MusicDTO();
			musicDTO.setTitle(st.nextToken().trim());
			musicDTO.setName(st.nextToken().trim());
			musicDTO.setRank(Integer.parseInt(st.nextToken().trim()));
			musicDTO.setLike(Integer.parseInt(st.nextToken().trim()));
			ar.add(musicDTO);

		}
		return ar;
	}

}
