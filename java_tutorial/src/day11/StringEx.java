package day11;

import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가격을 입력하세요 :");
		int price = Integer.parseInt(sc.nextLine());
		
		StringEx1 se1 = new StringEx1();
		se1.go(price);
	}
}

class StringEx1{
	
	// 천원 단위로 ,를 붙여주세요
	// 0 -> 0
	// 00 -> 00
	// 000 -> 000
	// 0000 -> 0,000
	// 00000 -> 00,000
	// 000000 -> 000,000
	// 0000000 -> 0,000,000
	// 00000000 -> 00,000,000
	public void go(int num) {
		// num을 문자열로
		String numString = ""+num;			// 정수 -> 문자열
		if(num < 1000) {			// 방법1. 숫자 범위를 비교     방법2. 문자열 길이 비교
			System.out.println(num);
		}
		else if(num < 10000) {
			// 1,000 ~ 9,999
			String str1 = numString.substring(0, 0+1);			// 1
			String str2 = numString.substring(1, 3+1);			// 000
			System.out.println(str1 + "," + str2);
		}
		else if(numString.length() == 5) {
			// 10000 ~ 99999
			String str1 = numString.substring(0, 1+1);			// 10
			String str2 = numString.substring(2, 4+1);			// 000
			System.out.println(str1 + "," + str2);
		}
		else if(num < 1000000) {
			// 100000 ~ 999999
			String str1 = numString.substring(0, 2+1);			// 10
			String str2 = numString.substring(3, 5+1);			// 000
			System.out.println(str1 + "," + str2);
		}
		else if(num < 10000000) {
			// 1000000 ~ 9999999
			String str1 = numString.substring(0, 1);			// 10
			String str2 = numString.substring(1, 3+1);			// 000
			String str3 = numString.substring(4, 6+1);			// 000
			System.out.println(str1 + "," + str2+","+str3);
		}
		
	}
}

