package _03_array;

public class Array4 {
	public static void main(String[] args) {
		String names[];
		int numbers[];
		
		names = new String[4];
		numbers = new int[4];
		
		names[0] = "김가빈";
		names[1] = "나지태";
		names[2] = "다나와";
		names[3] = "라면";
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		
		for (int i = 0; i < 4; i++) {
			System.out.println(numbers[i]+"번 - "+names[i]);
		}
	}
}
