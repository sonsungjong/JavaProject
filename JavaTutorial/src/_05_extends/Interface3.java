package _05_extends;

import java.util.Scanner;

public class Interface3 {
	public static void main(String[] args) {
		__Dog dog_list[] = new __Dog[20];		// 문제
		__Cat cat_list[] = new __Cat[20];		// 문제
		int select, type;
		int dog_count = 0, cat_count = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("====메뉴====");
			System.out.println("1. 추가");
			System.out.println("2. 먹어");
			System.out.println("3. 소리");
			System.out.println("4. 종료");
			System.out.println("기능 선택 : ");
			select = scanner.nextInt();
			
			if(select == 1) {
				System.out.println("0:개, 1:고양이 ? ");
				type = scanner.nextInt();
				if(type == 0) {
					dog_list[dog_count] = new __Dog();
					dog_count++;
				}else if(type == 1) {
					cat_list[cat_count] = new __Cat();
					cat_count++;
				}
			}else if(select == 2) {
				for (int i = 0; i < dog_count; i++) {
					dog_list[i].eat();
				}
				for (int i = 0; i < cat_count; i++) {
					cat_list[i].eat();
				}
			}else if(select == 3) {
				for (int i = 0; i < dog_count; i++) {
					dog_list[i].sound();
				}
				for (int i = 0; i < cat_count; i++) {
					cat_list[i].sound();
				}
			}else if(select == 4) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}

class __Dog{
	public void eat() {
		System.out.println("개밥");
	}
	public void sound() {
		System.out.println("멍멍");
	}
}

class __Cat{
	public void eat() {
		System.out.println("생선");
	}
	public void sound() {
		System.out.println("야옹");
	}
}