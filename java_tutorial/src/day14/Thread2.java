package day14;

import java.util.Scanner;

public class Thread2 {
	public static void main(String[] args) {
		Thread_1 t1 = new Thread_1();
		Thread_2 t2 = new Thread_2();
		Thread_3 t3 = new Thread_3();
		Thread tt3 = new Thread(t3);			// Runnable로 만들었을 경우
		
		t1.start();
		t2.start();
		tt3.start();
	}
}

class Thread_1 extends Thread{
	Scanner sc = new Scanner(System.in);
	private String str = "";
	@Override
	public void run() {			// run으로 만들고 start로 실행
		go();
	}
	
	public void go() {
		for (;;) {
			str = sc.nextLine();
			System.out.println(str);
		}
	}
}

class Thread_2 extends Thread{
	@Override
	public void run() {		// 추가쓰레드의 main함수(run으로 만들고 start로 실행)
		go();
	}
	public void go() {
		for (;;) {			// 무한반복
			System.out.println("Hello World");				
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// 자바는 다중상속이 안되기 때문에 추가로 상속할 수 있는 인터페이스를 제공 : Runnable
class Thread_3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("BGM 재생 중");
			try {
				Thread.sleep(200);			// 0.2초 쓰레드 중지
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

