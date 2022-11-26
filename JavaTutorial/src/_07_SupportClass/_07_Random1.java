package _07_SupportClass;

import java.util.Random;

public class _07_Random1 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;		// 1~100
		System.out.println(num);
		
		int num2 = (int)(Math.random()*100);		// 0~99
		System.out.println(num2);
		
		
		Random rand = new Random();
		System.out.println(rand.nextInt(100)+1);	// 1~100
		System.out.println(rand.nextInt(100));		// 0~99	
	}
}
