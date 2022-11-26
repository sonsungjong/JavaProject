package _04_class;

public class Class1{
	int num;
	public void sumPrint(int num1, int num2) {
		int num;
		num = num1 + num2;
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Class1 class1 = new Class1();
		class1.sumPrint(3,4);
	}

}
