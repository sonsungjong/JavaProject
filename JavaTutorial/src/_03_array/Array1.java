package _03_array;

public class Array1 {
	public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		int num[] = new int[5];
		
		num1 = 1;
		num2 = 2;
		num3 = 3;
		num4 = 4;
		num5 = 5;

		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;

		int numbers[];
		int count = 5;
		
		numbers = new int[count];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}
}
