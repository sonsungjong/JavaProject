package day06;

public class Class7 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.set이름("홍길동");
		p1.set나라("한국");
		p1.set나이(23);
		
		p2.set이름("아무개");
		p2.set나라("캐나다");
		p2.set나이(22);
		
		System.out.println(p1.get이름()+"은 "+p1.get나라()+"에서 온 "+p1.get나이()+"살이다.");
		System.out.println(p2.get이름()+"은 "+p2.get나라()+"에서 온 "+p2.get나이()+"살이다.");
		
		// 홍길동은 한국에서 온 23살이다.
		// 아무개은 캐나다에서 온 22살이다.
	}
}

// 클래스명 : Person
// 변수 : 이름, 나라, 나이
// 함수 : get, set
class Person{
	private String 이름;
	private String 나라;
	private int 나이;
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public String get나라() {
		return 나라;
	}
	public void set나라(String 나라) {
		this.나라 = 나라;
	}
	public int get나이() {
		return 나이;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	
}
// getter/setter : 우클릭 -> source -> Generate getter/setter...