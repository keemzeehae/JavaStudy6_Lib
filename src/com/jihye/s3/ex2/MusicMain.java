package com.jihye.s3.ex2;

import java.util.ArrayList;

public class MusicMain {

	public static void main(String[] args) {
		MusicData musicData = new MusicData();
		ArrayList<MusicDTO> musics = musicData.init();
		
//		musicData.addMusic(musics);
		MusicDTO musicDTO = musicData.removeMusic(musics);
		if (musicDTO != null) {
			System.out.println("삭제성공!");
			
		}else {
			System.out.println("삭제실패!");
		}
		for(int i=0;i<musics.size();i++) {
			System.out.println(musics.get(i).getTitle());
			System.out.println(musics.get(i).getName());
			System.out.println(musics.get(i).getRank());
			System.out.println(musics.get(i).getLike());
			System.out.println("==============================");
		}

	}

}
