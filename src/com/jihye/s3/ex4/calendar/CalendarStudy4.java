package com.jihye.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy4 {

	public static void main(String[] args) {
		//현재 시간
		Calendar ca = Calendar.getInstance();
		System.out.println("현재시간: "+ca.getTime());
		//태어난 날
		Calendar ca2 = Calendar.getInstance();
		ca2.set(1999, 0, 23);
		System.out.println("태어난날 : " + ca2.getTime());
		//며칠
		long l1 = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		
		long result = l1 - l2;
		
		System.out.println("오늘까지 산 일수: "+ result/(1000*60*60*24));
		System.out.println("나이: "+ result/(1000*60*60*24*365.2425));
		
		//365 *23
		

	}

}
