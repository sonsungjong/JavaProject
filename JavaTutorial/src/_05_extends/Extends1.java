package _05_extends;

public class Extends1 extends ChangeClass{
	@Override
	public String intToStr(int num) {
		System.out.println("숫자를 문자로");
		return super.intToStr(num);
	}
	
	@Override
	public int strToInt(String str) {
		System.out.println("문자를 숫자로");
		return super.strToInt(str);
	}
	
	public static void main(String[] args) {
		Extends1 et = new Extends1();
		String str = et.intToStr(100);
		int num = et.strToInt("123");
		
		System.out.println(str);
		System.out.println(num);
	}
}

class ChangeClass{
	protected String str;
	protected int num;
	final String dontChange = "hello world";
	
	// int -> String
	public String intToStr(int num) {
		this.num = num;
		str = Integer.toString(num);
		
		return str;
	}
	
	// String -> int
	public int strToInt(String str) {
		this.str = str;
		num = Integer.parseInt(str);
		
		return num;
	}
}