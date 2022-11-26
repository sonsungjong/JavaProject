package _05_extends;

public class Extends2 {
	public static void main(String[] args) {
		AbstractClass ac1 = new OneClass();
		AbstractClass ac2 = new TwoClass();
		ac1.abstractMethod();
		ac1.generalMethod();
		
		ac2.abstractMethod();
		ac2.generalMethod();
	}
}

abstract class AbstractClass{
	String name;
	int age;
	
	void generalMethod() {
		System.out.println("일반 메소드");
	}
	
	abstract void abstractMethod();
}

class OneClass extends AbstractClass{

	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("첫번째에서 구현");
	}
}

class TwoClass extends AbstractClass{

	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("두번째에서 구현");
	}
}