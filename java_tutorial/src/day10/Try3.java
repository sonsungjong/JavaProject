package day10;

import java.util.Scanner;

public class Try3 {
	public static void main(String[] args) {
		MyClass3 mc3 = new MyClass3();
		//mc3.go();
		double result = mc3.divide(20, 10);			// 20 ÷ 10
		System.out.println(result);
		
		result = mc3.divide2(10, 0.0);				// 10 ÷ 0		==> 버그발생으로 프로그램 강제 종료
		System.out.println(result);
	}
}
// 예외처리하기
class MyClass3{
	double divide(double num1, double num2) {
		double result = 0.0;
		if(num2 != 0)		// num2가 0일때는 나누기 하지마라 
		{	
			result = num1 / num2;			// 0으로 나누면 프로그램 버그 발생	
		}else {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		return result;
	}
	
	double divide2(double num1, double num2) {
		double result = 0.0;
		try {	
			result = num1 / num2;			// 0으로 나누면 프로그램 버그 발생	
		}catch(Exception e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		return result;
	}
	
	Scanner sc = new Scanner(System.in);
	public void go() {
		System.out.println("프로그램 시작");
		int a = 0, b = 0, c = 0;
		
		System.out.println("숫자1을 입력하세요");
		try {
			a = sc.nextInt();				// 버그발생 가능
		}catch(Exception e) {
			System.out.println("20번째 줄에서 오류 발생");
		}
		System.out.println(a);
		
		System.out.println("숫자2를 입력하세요");
		try {
			b = Integer.parseInt(sc.next());	// 버그발생 가능
		}catch(Exception e) {
			System.out.println("28번째 줄에서 오류 발생");
		}
		System.out.println(b);
		
		// if(b != 0){} -> try{}
		try {
			c = a / b;					// 버그발생 가능
		}catch(Exception e) {
			System.out.println("35번째 줄에서 오류 발생");
		}
		System.out.println(c);
		
		sc.close();
		System.out.println("프로그램 종료");
	}
	
}




