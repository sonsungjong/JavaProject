package _07_SupportClass;

import java.util.Scanner;

public class _03_String3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일 이름: ");
		String fileName = sc.next();
		
		String[] splitName = fileName.split("\\.");
		System.out.println("파일명 : " + splitName[0]);
		System.out.println("확장자 : " + splitName[1]);
	}
}