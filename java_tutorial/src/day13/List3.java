package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List3 {
	public static void main(String[] args) {
		
	}
}

class Menu1{
	private int choice = -1;
	
	public void go() {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String str1 = "", str2 = "";
		
		while(true) {
			System.out.println("[1.추가 2.수정 3.제거 4.보기 0.종료]");
			choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("추가할 항목입력 >>");
				str1 = sc.next();
				arr.add(str1);
			}
			else if(choice == 2) {
				System.out.println("수정할 위치 입력 >>");
				
				System.out.println("수정할 내용 입력 >>");
				
				
			}
			else if(choice == 3) {
				System.out.println("삭제할 위치 입력 >>");
				
				
			}
			else if(choice == 4) {
				// 전체 조회
			}
			else if(choice == 0) {
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
}

