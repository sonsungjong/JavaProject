package _03_array;

public class Array2 {
	public static void main(String[] args) {
		String str[] = new String[5];
		
		for (int i = 0; i < str.length; i++) {
			str[i] = i+"번";
			System.out.println(str[i]);
		}
		
	}
}
