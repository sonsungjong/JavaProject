package day16;

public class _04_while {
	public static void main(String[] args) {
		// 반복문
		// while(){}
		// for(){}
		
		// while은 if와 비슷하나 반복을 한다는 특징이 있음
		int age = 30;
		if(age >= 20) {
			System.out.println("성인");
		}			// if는 조건이 맞으면 한번만
		
		while(age >= 20) {
			System.out.println("성인 반복");
		}			// while은 조건이 맞는 동안에는 계속
		
		// 원하는 만큼만 반복을 시켜주려면 플래그i를 따로 세워준다.
		int i = 0;
		while(age >= 20 && i < 5) {
			System.out.println("성인 반복2");
			i++;		// 5번 반복을 하면 while을 탈출할 수 있게 플래그를 증감시킨다. 
		}
		
		// 여기저기 중구난방으로 플래그가 써있는 while을 보기 좋게 만든 것이 for
		for(int j=0; j < 5 && age >= 20; j++) {
			System.out.println(j+"번 반복");
			
			if(j == 3) {
				break;		// 탈출 (반복문 즉시 종료)
			}else if(age == 0) {
				continue;		// 1회성 취소 (반복문 처음 위치로 돌아감)
			}
		}
	}
}
