package com.section03;

import java.util.Calendar;

public class CalendarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		
		System.out.println("현재날짜: ");
		System.out.println(c.get(Calendar.YEAR) + "년 ");
		System.out.println((c.get(Calendar.MONTH) + 1) + "월 "); 
		System.out.println(c.get(Calendar.DATE) + "일 ");
	}

}
