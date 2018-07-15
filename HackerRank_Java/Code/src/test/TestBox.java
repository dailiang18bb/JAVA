package test;

import java.util.Calendar;
import java.util.Date;

public class TestBox {


	public static void main(String[] args) {

		System.out.println(String.format("%tc", new Date()));
		System.out.println(String.format("%tr", new Date()));
		System.out.println(String.format("%tA, %tB %td", new Date(), new Date(), new Date()));
		System.out.println(String.format("%tA, %<tB %<td", new Date()));

		Calendar cal = Calendar.getInstance();
		cal.set(2004,0,7,15,40);
		long day1 = cal.getTimeInMillis();
		System.out.println(day1);
		day1 += 1000*60*60;
		System.out.println(day1);
		cal.setTimeInMillis(day1);
		System.out.println("New hour " + cal.get(cal.HOUR_OF_DAY));
		System.out.println("New hour " + cal.get(cal.DAY_OF_WEEK));
		System.out.println(cal.getTime());
		cal.add(cal.DATE, 35);
		System.out.println(cal.getTime());
		cal.roll(cal.DATE, 35);
		System.out.println(cal.getTime());
		cal.set(cal.DATE, 1);
		System.out.println(cal.getTime());




	}

}