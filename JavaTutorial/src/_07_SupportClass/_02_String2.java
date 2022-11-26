package _07_SupportClass;

public class _02_String2 {
	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.charAt(6));
		System.out.println(str1.indexOf("W"));
		System.out.println(str1.length());
		System.out.println(str1.startsWith("Hello"));
		System.out.println(str1.contains("World"));
		System.out.println(str1.replace("Hello", "Hi"));
		System.out.println(str1.substring(6, 11));			// 6~10 파싱
	}
}
