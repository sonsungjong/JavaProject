package day12;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		Rand1 r1 = new Rand1();
		r1.go3();
		
		Rand2 r2 = new Rand2();
		r2.go3();
	}
}

class Rand1{
	Random rand = new Random();
	
	// 0 ~ 9
	public void go1() {
		int result = rand.nextInt(10);			// 0 ~ 9 랜덤
		System.out.println(result);
	}
	
	// 0~4
	public void go4() {
		int result = rand.nextInt(5);			// 0 ~ 4 랜덤
		System.out.println(result);
	}
	
	// 1 ~ 10
	public void go2() {
		int result = rand.nextInt(10) +1;		// 0+1 ~ 9+1 랜덤
		System.out.println(result);			// 1~10
	}
	
	// 100 ~ 105
	public void go3() {
		int result = rand.nextInt(6) +100;		// 0+100 ~ 5+100
		System.out.println(result);
	}
}

class Rand2{
	public void go1() {
		int result = (int)(Math.random()*10);		// 0~9 랜덤
		System.out.println(result);
	}
	
	public void go4() {
		int result = (int)(Math.random()*5);		// 0~4 랜덤
		System.out.println(result);
	}
	
	public void go2() {
		int result = (int)(Math.random()*10) +1;		// 0+1 ~ 9+1 랜덤
		System.out.println(result);			// 1~10
	}
	
	public void go3() {
		// 100~105 랜덤
		
	}
}
// Random2.java -> Rand3 클래스 -> 입력받은 두 수 사이에서 랜덤
// public void go(int n1, int n2){}