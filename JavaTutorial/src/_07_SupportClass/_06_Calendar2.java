package _07_SupportClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class _06_Calendar2 {
	public static int count = 0;
	
	public static void main(String[] args) {
						
		Timer m_timer = new Timer();
		TimerTask m_task = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				if(count < 5) {
					Calendar c = Calendar.getInstance();
					Date date = c.getTime();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
					String myDate = sdf.format(date);
					System.out.println(myDate);
				}else {
					m_timer.cancel();
				}
			}
		};
		m_timer.schedule(m_task, 0, 1000);
	}
}
