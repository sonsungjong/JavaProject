package _09_thread;

public class Runnable1 {
	public static void main(String[] args) {
		MyThread2 mt2 = new MyThread2();
		Thread thread = new Thread(mt2);
		thread.start();
	}
}

class MyThread2 implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			try {
				System.out.print("$");
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
}