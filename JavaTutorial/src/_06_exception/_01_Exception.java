package _06_exception;

import java.util.Scanner;

public class _01_Exception {
	public static void main(String[] args) {
		int num1 = 10;
		int num2;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("num2>>>");
			num2 = scanner.nextInt();
			try {
				System.out.println(num1/num2);
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
	}
}
