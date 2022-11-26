package _04_class;

public class Class2 {
	public static void main(String[] args) {
		String info;
		MySecond ms = new MySecond("손성종", 29);
		
		ms.upAge(100);
		info = ms.myInfo();
		System.out.println(info);
	}
}

class MySecond{
	private String name;
	private int age;
	
	public MySecond(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String myInfo() {
		String str = "이름: "+name+", 나이: "+age;
		return str;
	}
	
	public void upAge(int num) {
		age += num;
	}
}