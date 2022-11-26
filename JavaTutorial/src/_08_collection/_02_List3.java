package _08_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_List3 {
	public static void main(String[] args) {
		ArrayList<String> arr3 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int select = 0;
		String name = "";
		while(true) {
			System.out.print("[1.추가 2.수정 3.제거 4.보기 0.종료]");
			select = Integer.parseInt(sc.nextLine());
			if(select == 1) {
				System.out.print("추가할 항목입력>>");
				name = sc.nextLine();
				arr3.add(name);
			}else if(select == 2) {
				System.out.print("수정할 위치를 입력하세요>>");
				select = Integer.parseInt(sc.nextLine());
				System.out.print("수정내용을 입력하세요>>");
				name = sc.nextLine();
				arr3.set(select, name);
			}else if(select == 3) {
				System.out.print("삭제할 위치를 입력하세요>>");
				select = Integer.parseInt(sc.nextLine());
				arr3.remove(select);
			}else if(select == 0) {
				break;
			}else {
				for (int i = 0; i < arr3.size(); i++) {
					System.out.print(arr3.get(i)+" ");
				}
				System.out.println();
			}
		}
		System.out.println("프로그램 종료");
	}
}
