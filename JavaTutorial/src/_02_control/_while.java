package _02_control;

public class _while {
	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		
		/*
		   sum = sum + 1;
		   sum = sum + 2;
		   sum = sum + 3;
		   sum = sum + 4;
		   sum = sum + 5;
		   sum = sum + 6;
		   sum = sum + 7;
		   sum = sum + 8;
		   sum = sum + 9;
		   sum = sum + 10;
		*/
		
		while(i<=50) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);
	}
}
