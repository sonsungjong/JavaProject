package jspweb;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Controller {
	Model model = new Model();
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public String info() {
		return model.getName();
	}
	
	public String getDate() {
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		return sdf.format(date);
	}
}