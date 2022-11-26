package _09_thread;


public class Thread1 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.run();		
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println("====쓰레드====");
			try {
				sleep(20);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}