package cn.com.lakers.test;

import java.util.Calendar;

public class TestCalendar {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.set(2016,11,1,15,30);
		System.out.println("c : " + c);
		
		long day1 = c.getTimeInMillis();
		System.out.println("day1 : " + day1);
		
		day1 += 100*60*60;
		c.setTimeInMillis(day1);
		System.out.println("c : " + c);

	}
}
