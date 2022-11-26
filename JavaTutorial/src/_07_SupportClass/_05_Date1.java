package _07_SupportClass;

import java.util.Date;

public class _05_Date1 {
	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println("year : "+(date1.getYear()+1900));
		System.out.println("month : "+(date1.getMonth()+1));
		System.out.println("date : "+date1.getDate());
		System.out.println("hour : "+date1.getHours());
		System.out.println("min : "+date1.getMinutes());
		System.out.println("second : "+date1.getSeconds());
		
		System.out.println(date1);
	}
}
