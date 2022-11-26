package _06_exception;

import java.util.Scanner;

public class _02_Exception2 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 1;
		char c = 'a';
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("num2>>>");
			try {
				System.out.println(num1/c);
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
	}
}
