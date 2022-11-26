package _07_SupportClass;

public class _01_String1 {
	public static void main(String[] args) {
		String str1 = "string";
		String str2 = new String("string");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}
}
