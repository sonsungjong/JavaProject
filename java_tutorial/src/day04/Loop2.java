package day04;

public class Loop2 {
	public static void main(String[] args) {
		// if 안에 if, switch
		// switch 안에 if, switch
		// for 안에 if		
		// for 안에 for : 이중for문
		for (int i = 0; i < 3; i++) {		// 바깥
			// 0
			for (int j = 0; j < 3; j++) {		// 안쪽
				// 0
				System.out.println("바깥i="+i+" 안쪽j="+j);
			}
		}
		// 이중for문 끝
	}
}
