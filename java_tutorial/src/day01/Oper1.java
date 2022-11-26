package day01;

public class Oper1 {
	public static void main(String[] args) {
		// 연산자 (자바에서 제공하는 기능) Operator
		// +, -, x, ÷ 등등을 연산자라고 부른다.
		int num;
		String str;
		// 더하기+
		num = 3+2;			// 숫자의 더하기
		str = "Hello" + " Java";	// 글자의 더하기
		// 빼기-
		num = 3-5;
		// 곱하기*
		num = 3*3;
		// 나누기/
		num = 9/3;
		// 나머지구하기%
		num = 9%2;
		// 출력
		System.out.println(num);
		System.out.println(str);
	}
}