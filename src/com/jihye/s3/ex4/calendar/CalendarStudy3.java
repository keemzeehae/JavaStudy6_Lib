package com.jihye.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy3 {

	public static void main(String[] args) {
		//1초 ==1000
		//1분 ==60초
		//1시간 ==60분
		//1일 ==24시간
		//1년 ==365일
		
		System.out.println(1000*60*60*24*365);
		
		//현재시간 
		Calendar ca = Calendar.getInstance();
		//2시간뒤 
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.HOUR_OF_DAY, 8);
		
		System.out.println(ca.getTime());
		System.out.println(ca2.getTime());
		
		int h = ca.get(Calendar.HOUR);
//		여기서 int h = ca.get(Calendar.HOUR + 2); 하면 분이 나오고 +3 하면 초가 나옴
		System.out.println("두시간 뒤: "+(h+2));
		
//		둘간의 시간차를 구하려함
		long l1 = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		long result = l2-l1;
		System.out.println(result/(1000*60*60));
		

	}

}
