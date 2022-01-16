package com.jihye.s3.ex4.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarStudy1 {

	public static void main(String[] args) {
		//Calendar는 추상클래스 (객체 못만듦)
		//GregorianCalendar는 Calendar를 클래스 상속
		//부모클래스:Calendar 자식클래스:Gregorian public class GregorianCalendar extends Calendar
		//Calender의 메서드는 GragorianCalender에도 있다

		
		GregorianCalendar gc = new GregorianCalendar();
		Calendar calendar = new GregorianCalendar();
		Calendar ca = Calendar.getInstance(); //실제로 오는건 Gregorian 이다 
		
		System.out.println(gc);
		System.out.println(calendar);
		System.out.println(ca);
		
		int y = ca.get(Calendar.YEAR);
		System.out.println("Y:" +y);
		int m = ca.get(Calendar.MONTH);
		System.out.println("M: "+(m+1));
		int d = ca.get(Calendar.DATE);
		System.out.println("D: "+ d);
		int h = ca.get(Calendar.HOUR);
		System.out.println("H: "+ h);
		int hh = ca.get(Calendar.HOUR_OF_DAY);
		System.out.println("HH: "+ hh);
		int min = ca.get(Calendar.MINUTE);
		System.out.println("Min: " +min);
		int s = ca.get(Calendar.SECOND);
		System.out.println("Sec: " +s);
		int mil= ca.get(Calendar.MILLISECOND);
		System.out.println("Milli: " +mil);
		//1000분의 1초
		//1000==1
		
		long millis = ca.getTimeInMillis();
		System.out.println("Millis:" +millis);
		
		Date date = ca.getTime();
		System.out.println(date);
		
		
		//getTime을 쓰는 이유는 test하기 편함, 시간을 보기가 편함 
		
	
		
		
		
	}

}
