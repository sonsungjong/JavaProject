package day06;

public class Class4 {
	public static void main(String[] args) {
		사칙연산 a = new 사칙연산();
		double result = 0;
		result = a.더하기(3,2);
		System.out.println((int)result);
		result = a.빼기(1, 2);
		System.out.println((int)result);
		result = a.곱하기(1, 2);
		System.out.println((int)result);
		result = a.나누기(1, 2);
		System.out.println(result);
	}
}

class 사칙연산{
	int 더하기(int num1, int num2) {
		return num1+num2;
	}
	int 빼기(int num1, int num2) {
		return num1-num2;
	}
	int 곱하기(int num1, int num2) {
		return num1*num2;
	}
	double 나누기(int num1, int num2) {
		return (double)num1/(double)num2;
	}
}

