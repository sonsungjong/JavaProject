package day11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time1 {
	public static void main(String[] args) {
		NowTime nt = new NowTime();
		nt.go();
		nt.go2();
		nt.go3();
	}
}

class NowTime{
	public void go() {
		// main
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		// sdf1.format(date) : SimpleDateFormat을 String으로
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf3 = new SimpleDateFormat("MM");
		System.out.println(sdf2.format(date)+"년");
		System.out.println(Integer.parseInt(sdf3.format(date))+"월");
		System.out.println(sdf2.format(date)+"년 " + Integer.parseInt(sdf3.format(date))+"월");
	}
	
	public void go2() {
		// 내일은 2022년 7월 31일
		// Integer.parseInt로 문자열을 정수로 바꿔서 더하기
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
		
		String year = sdf1.format(date);
		String month = sdf2.format(date);
		String day = sdf3.format(date);
		
		// 내일은 2022년 7월 31일
		System.out.println("내일은 "+year+"년 "+month+"월 "+(Integer.parseInt(day)+1)+"일");
		
	}
	
	public void go3() {
		// 문자열 substring 사용, SimpleDateFormat은 한번만 사용
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String time = sdf.format(date);			// 2022-07-30-11-38-22
		
		
		// 내일은 2022년 7월 31일
		// substring 사용
		String year = time.substring(0, 4);
		String month = time.substring(5, 7);
		String day = time.substring(8, 10);
		String hour = time.substring(11,13);
		String minute = time.substring(14, 16);
		String sec = time.substring(17, 19);
		System.out.println("내일은 "+year+"년 "+month+"월 "+(Integer.parseInt(day)+1)+"일");
	}
	
	
}