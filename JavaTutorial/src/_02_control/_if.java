package _02_control;

public class _if {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		int num3 = 20;
		
		if(num1 == num2) {
			System.out.println("num1과 num2는 같다.");
		}else {
			System.out.println("num1과 num2는 다르다.");
		}
		
		if(num1 == num2 && num1 == num3) {
			System.out.println("num1과 num2와 num3은 같다.");
		}else if(num1 == 10 || num1 == 30) {
			System.out.println("num1은 10 또는 30과 같다.");
		}else if(num2 != 0) {
			System.out.println("num2는 0이 아니다.");
		}else {
			System.out.println("모두 아니다.");
		}
		
		
	}
}
