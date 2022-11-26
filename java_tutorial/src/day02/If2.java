package day02;

public class If2 {
	public static void main(String[] args) {
		// 버스를 탔습니다. 카드를 찍네요. 나이에 따라서 멘트를 다르게 해주세요.
		// 나이가 20이상이면 "성인", 
		// 나이가 14~20은 "청소년", 
		// 나이가 14미만이면 "어린이"
		
		int 나이 = 12;
		
		if(나이 >= 20) {
			System.out.println("성인");
		}
		if(나이 >= 14 && 나이 < 20) {
			System.out.println("청소년");
		}
		if(나이 < 14) {
			System.out.println("어린이");
		}
		
	}
}
