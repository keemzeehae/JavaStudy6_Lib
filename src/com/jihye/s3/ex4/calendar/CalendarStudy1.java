package com.jihye.s3.ex4.calendar;

import java.util.Calendar;
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
		Calendar ca =Calendar.getInstance();
		


	}

}
