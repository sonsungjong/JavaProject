package _02_control;

public class _for2 {
	public static void main(String[] args) {
		System.out.println("====구구단====");
		for (int i = 2; i < 50; i++) {
			System.out.print(i+"단\t");
			if(i >= 9) {
				System.out.println();
				break;
			}
		}
		
		// 구구단
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + i*j);
				System.out.print("\t");
			}
			if(i==9) {
				break;
			}
			System.out.println();
		}
		
	}
}

/*
if(j == 3) {
	continue;
} else if(j == 8) {
	break;
}
*/