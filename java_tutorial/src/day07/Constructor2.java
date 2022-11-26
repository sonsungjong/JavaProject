package day07;

public class Constructor2 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", "대한민국", 22);
		p1.go();
		
		Person p2 = new Person("김철수", "캐나다", 33);
		p2.go();
	}
}

class Person{
	private String 이름;
	private String 나라;
	private int 나이;
	
	// 생성자를 통해서 set
	Person(String name, String nation, int age){
		set이름(name);
		set나라(nation);
		set나이(age);
	}
	
	public void go() {		// main
		// go함수를 통해서 syso(get())
		System.out.println("이름은 "+get이름()+", 국가는 "+get나라()+", 나이는 "+get나이());
	}

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