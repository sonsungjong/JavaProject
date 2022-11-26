package day06;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		Array4Ex a = new Array4Ex();
		a.go();
	}
}

class Array4Ex{
	Scanner sc = new Scanner(System.in);
	public void go() {
		// 입력받은 나라의 수도를 알려주는 프로그램 개발!
		// 국가이름을 입력하면 해당 국가에 대한 수도를 알려주세요.
		String nations[] = {"한국","미국","중국"};
		String cities[] = {"서울","워싱턴","베이징"};
		int flag = 0;
		
		while(true) {
			System.out.println("어느 나라의 수도가 궁금하신가요?");
			String input = sc.next();		// input.equals() 로 같은지 비교
			
			for (int i = 0; i < nations.length; i++) {
				if(input.equals(nations[i])) {
					System.out.println(nations[i]+"의 수도는 "+cities[i]+"입니다.");
					flag = 0;
					break;
				}else {
					flag = 1;
				}
			}
			if(flag == 1) {
				System.out.println("해당 국가 없습니다.");
			}
		}
	}
}

// git add *
// git commit -m "자바 6일"
// git push origin master

