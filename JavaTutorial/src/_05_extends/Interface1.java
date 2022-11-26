package _05_extends;

public class Interface1{
	public static void main(String[] args) {
		FirstInterface in1 = new FirstInterface1Impl();
		in1.interfaceMethod();
	}
}

class FirstInterface1Impl implements FirstInterface{

	@Override
	public void interfaceMethod() {
		// TODO Auto-generated method stub
		System.out.println("interface 메소드 구현");
	}
	
}