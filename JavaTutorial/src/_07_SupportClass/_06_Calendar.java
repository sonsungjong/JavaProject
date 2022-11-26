package _07_SupportClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class _06_Calendar {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		//SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		String myDate = sdf.format(date);
		
		System.out.println(myDate);
		//System.out.println(Integer.parseInt(sdf1.format(date))+1);
	}
}
