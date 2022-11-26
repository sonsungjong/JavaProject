package _01_variable;
// 연산
public class Variable3 {
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 10;
		String str1 = "hello";
		String str2 = "world";
		
		// +, -, *, /, %
		int num3 = num1 + num2;
		System.out.println(num3);
		num3 = num1 - num2;
		System.out.println(num3);
		num3 = num1 * num2;
		System.out.println(num3);
		num3 = num1 / num2;
		System.out.println(num3);
		num3 = num1 % num2;
		System.out.println(num3);
		
		String str3 = str1 + str2;
		System.out.println(str3);
		
		String str4 = str1 + " " + str2 + num1;
		System.out.println(str4);
	}
}
