package _09_thread;

import java.util.ArrayList;

public class Join1 {
	public static ArrayList<String> carList = new ArrayList<String>();
	public static void main(String[] args) {
		Before1 before = new Before1();
		After1 after = new After1();
		before.start();
		try {
			before.join();
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		after.start();
	}
}

class Before1 extends Thread{
	public void addCar() {
		System.out.println("자동차추가");
		Join1.carList.add("모닝");
		Join1.carList.add("K5");
		Join1.carList.add("그랜저");
		Join1.carList.add("제네시스");
	}
	@Override
	public void run() {
		System.out.println("비포쓰레드 시작");
		addCar();
		System.out.println("비포쓰레드 끝");
	}
}

class After1 extends Thread{
	@Override
	public void run() {
		System.out.println("에프터쓰레드 시작");
		for (int i = 0; i < Join1.carList.size(); i++) {
			System.out.println(Join1.carList.get(i));
		}
		System.out.println("에프터쓰레드 끝");
	}
}