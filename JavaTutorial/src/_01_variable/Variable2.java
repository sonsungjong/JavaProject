package _01_variable;
// 형변환
public class Variable2 {
	public static void main(String[] args) {
		int num1;
		double num2 = 3.14;
		String str = "314";
		
		// int <-> double
		num1 = (int)num2;
		System.out.println(num1);			// 3
		num2 = (double)num1;
		System.out.println(num2);			// 3.0
		
		// String -> int, double
		num1 = Integer.parseInt(str);
		System.out.println(num1);			// 314
		num2 = Double.parseDouble(str);
		System.out.println(num2);			// 314.0
		
		// int, double -> String
		str = Integer.toString(num1);
		System.out.println(str);			// "314"
		str = Double.toString(num2);
		System.out.println(str);			// "314.0"
	}
}
