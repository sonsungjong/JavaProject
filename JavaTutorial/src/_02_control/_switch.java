package _02_control;

public class _switch {
	public static void main(String[] args) {
		int num = 3;
		String str = "사람";
		
		switch(num) {
		case 1:
			System.out.println("num은 1");
			break;
		case 2:
			System.out.println("num은 2");
			break;
		case 3:
			System.out.println("num은 3");
			break;
		case 4:
			System.out.println("num은 4");
			break;
		default:
			System.out.println("해당 없음");
		}
		
		switch(str) {
		case "강아지":
			System.out.println("멍멍");
			break;
		case "원숭이":
			System.out.println("우끼끼");
			break;
		case "사람":
			System.out.println("히히");
			break;
		case "고양이":
			System.out.println("냐옹");
			break;
		default:
			System.out.println("해당 없음");
		}
	}
}
