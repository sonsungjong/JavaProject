package _05_extends;

public class Interface2 {
	public static void main(String[] args) {
		Pet dog = new Dog();
		Pet cat = new Cat();
		Pet bird = new Bird();
		Pet pet_list[] = new Pet[40];
		int pet_count = 0;
		pet_list[0] = new Dog();
		pet_count++;
		pet_list[1] = new Cat();
		pet_count++;
		pet_list[2] = new Bird();
		pet_count++;
		
		dog.sound();
		cat.sound();
		bird.sound();
		System.out.println("==========");
		dog.eat();
		cat.eat();
		bird.eat();
		
		for (int i = 0; i < pet_count; i++) {
			pet_list[i].eat();
		}
	}
}

class Dog implements Pet{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("개밥");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	
}

class Cat implements Pet{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("츄르");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("냐옹");
	}
	
}

class Bird implements Pet{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("꿈틀이");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("짹짹");
	}
	
}