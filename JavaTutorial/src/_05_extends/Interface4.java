package _05_extends;

import java.util.Scanner;

public class Interface4{
	public static void main(String[] args) {
		Pet pet_list[] = new Pet[40];
		// Dog dog_list[] = new Dog[20];
		// Cat cat_list[] = new Cat[20];
		int select, type;
		int pet_count = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("====메뉴====");
			System.out.println("1. 추가");
			System.out.println("2. 먹기");
			System.out.println("3. 소리");
			System.out.println("4. 종료");
			
			System.out.println("기능 선택: ");
			select = scanner.nextInt();
			
			if(select == 1) {
				System.out.println("0: 개, 1: 고양이 ?");
				type = scanner.nextInt();
				if(type == 0) {
					pet_list[pet_count] = new _Dog();
					pet_count++;
				}else if(type == 1) {
					pet_list[pet_count] = new _Cat();
					pet_count++;
				}
				// 항목이 바뀌어도 특정 부분만 수정하면 되도록 코드가 통일됨
				// 다른 동물이 추가되어도 해당 코드만 추가
			}else if(select == 2) {
				for(int i=0;i<pet_count;i++) {
					pet_list[i].eat();
				}
			}else if(select == 3) {
				for (int i = 0; i < pet_count; i++) {
					pet_list[i].sound();
				}
			}else if(select == 4) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}

class _Dog implements Pet{

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

class _Cat implements Pet{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("생선");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}
}