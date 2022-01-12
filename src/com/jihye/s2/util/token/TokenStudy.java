package com.jihye.s2.util.token;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String str ="봄,16,여름,32,가을,26,겨울,-5";
		//배열은 같은 "봄,여름,가을,겨울" 이럴때 사용하면 더 좋겠지
		String [] s = str.split(",");
		StringTokenizer st = new StringTokenizer(str,",");
		//hasmoretokens 뜻: 자를 토큰이 더 있나요? 다음 쉼표가 있는지 있으면 true를 얘기해 없으면 false를 얘기하고 종료
		ArrayList<SeasonDTO> ar =new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			SeasonDTO seasonDTO = new SeasonDTO();
			String token = st.nextToken().trim();
			seasonDTO.setName(token); //봄
			
			token = st.nextToken();//16
			seasonDTO.setC(Integer.parseInt(token.trim()));
			ar.add(seasonDTO);
			System.out.println(seasonDTO.getName());
			System.out.println(seasonDTO.getC());
		}
		for(int i = 0;i<ar.size();i++) {
			SeasonDTO seasonDTO = ar.get(i);
			System.out.println(seasonDTO.getName());
			System.out.println(ar.get(i).getC());
		}

	}
}


	//이렇게 해도 됨
//	String str ="봄, 여름, 가을, 겨울";
//	
//	StringTokenizer st = new StringTokenizer(str);
//	//hasmoretokens 뜻: 자를 토큰이 더 있나요? 다음 쉼표가 있는지 있으면 true를 얘기해 없으면 false를 얘기하고 종료
//	
//	while(st.hasMoreTokens()) {
//		String token = st.nextToken(",");
//		
//		System.out.println(token.trim());
//	}
//	



