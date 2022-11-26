package _02_control;

import java.util.Scanner;

public class _if3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디를 입력하세요>>>");
		String id = scanner.next();
		System.out.print("비밀번호를 입력하세요>>>");
		int password = scanner.nextInt();
		
		if(!(id.equals("hello")) || !(password == 1234)) {
			System.out.println("없는 아이디이거나 비밀번호가 일치하지 않습니다.");
		}else {
			System.out.println("로그인 성공");
		}
		
		scanner.close();
	}
}
