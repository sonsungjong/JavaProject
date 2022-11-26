package _02_control;

public class _if2 {
	public static void main(String[] args) {
		int year = 200;
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year+"년은 윤년입니다.");
		}else {
			System.out.println(year+"년은 평년입니다.");
		}
	}
}
