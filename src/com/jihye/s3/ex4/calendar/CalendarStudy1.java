package com.jihye.s3.ex4.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarStudy1 {

	public static void main(String[] args) {
		
		//Calendar는 추상클래스라서 객체를 못만듦
		//GregorianCalendar는 Calendar를 클래스 상속
		//부모클래스: Calendar 자식 클래스: GregorianCalendar 
		//-> public class Gregorian extends Calendar
		//Calendar의 메서드는 GregorianCalendar에도 있다.
		
		GregorianCalendar gc = new GregorianCalendar();
		Calendar calendar = new GregorianCalendar();
		Calendar ca =Calendar.getInstance();//실제로 오는 건 Gregorian이다
		
		System.out.println(gc);
		System.out.println(calendar);
		System.out.println(ca);
		
		int y = ca.get(Calendar.YEAR);
		System.out.println("Year: "+y);
		int m = ca.get(Calendar.MONTH);
		System.out.println("Month: "+m);
		int d = ca.get(Calendar.DATE);
		System.out.println("Date: "+d);
		int h = ca.get(Calendar.HOUR);
		System.out.println("Hour: "+h);
		int min = ca.get(Calendar.MINUTE);
		System.out.println("Minute: "+min);
		int sc = ca.get(Calendar.SECOND);
		System.out.println("Second: "+sc);
		int mil = ca.get(Calendar.MILLISECOND);
		System.out.println("Milli: "+mil);
		
		
		long millis = ca.getTimeInMillis();
		System.out.println("Millis: "+millis);
		
		Date date = ca.getTime();
		System.out.println(date);
		//getTime을 쓰는 이유는 test하기 편함, 시간을 보기가 편함
		
		


	}

}
