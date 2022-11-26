package day01;

public class Var3 {
	public static void main(String[] args) {
		// 변수로 이름, 생년월일, 키를 저장해놓고 사용
		String name = "손성종";
		String birth = "1950년 5월 5일";
		int year = 1950, month = 5, day = 5;
		double height = 177.0;
		System.out.println("이름 : "+name);
		System.out.println("생일 : "+year+"년 "+month+"월 "+day+"일");
		System.out.println("키 : "+height+"cm");
		/*
		  	이름 : 홍길동
			생일 : 2000년 7월 15일
			키 : 175.5cm
			
			단, 이름과 생년월일, 키는 변수로 저장해서 사용
		 */
	}
}
