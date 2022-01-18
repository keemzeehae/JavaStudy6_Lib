package com.jihye.s3.ex4.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarStudy5 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		//30분 소요예정
		//도착 예정 시간은?
		//1000*60*30 > 밀리세컨즈에서 환산한 30분
		//현재시간
		System.out.println(ca.getTime());
		
		long time = ca.getTimeInMillis();
		time = time+1000*60*30;
		ca.setTimeInMillis(time);
		//30분 후 시간
		System.out.println(ca.getTime());
		//또 그 이후 30분 시간 roll 이용 roll은 지정된 것에만 영향을 미치고 다른 필드에는 영향이 없음
		ca.roll(Calendar.MINUTE, 70); //roll을 사용해서 분에 70분을 더해주면 결과는? 70-60 +10
		System.out.println(ca.getTime());
		//add라는 메서드는 다른 필드에도 영향이 있음!
		ca.add(Calendar.MINUTE, 70);
		System.out.println(ca.getTime());
		
		// 이건 라이브러리에 정해져 있는 것
		String pattern = "yyyy년MM월dd일 - HH:mm:ss";
		
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		String r = sd.format(ca.getTime());
		System.out.println(r);
		
		pattern = "yyyy-MM-dd (E)";
		sd.applyPattern(pattern);
		
		System.out.println(sd.format(ca.getTime()));
	

	}

}
