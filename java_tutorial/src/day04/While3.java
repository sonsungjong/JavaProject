package day04;

public class While3 {
	public static void main(String[] args) {
		// 3번 (while 사용)
		int i=0;
		while(i < 3) {
			System.out.println("안녕하세요");
			System.out.println("반갑습니다");
			i++;
		}
		// 여기로
		i = 1;
		while(i<=3) {
			System.out.println(i+"번");
			i++;
		}
		
		// 1~10까지 출력 (while 사용)
		int num = 1;
		while(num <= 10) {
			System.out.println(num);
			num++;
		}
		
		// 10 ~ 1 까지 출력
		num = 10;
		while(num >= 1) {
			System.out.println(num);
			num--;
		}
		
		
	}
}
