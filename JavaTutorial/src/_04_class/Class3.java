package _04_class;

public class Class3 {
	String str;
	public static String str1;			// 전역 : 객체화를 안해도 접근가능
	
	public static void main(String[] args) {			// static : 지역에 있는 전역
		MyThird mt = new MyThird(20,10);
		System.out.println(mt.getX());
		System.out.println(mt.getY());
		
		System.out.println(mt.sum());
		System.out.println(mt.sum(100, 100));
	}
}

class MyThird{
	private int x, y;
	
	// 오버로딩(생성자)
	public MyThird() {}
	public MyThird(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("생성자 사용");
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

	// 오버로딩(메소드)
	public int sum() {
		return x+y;
	}
	public int sum(int x, int y) {
		this.x = x;
		this.y = y;
		return this.x+this.y;
	}

}