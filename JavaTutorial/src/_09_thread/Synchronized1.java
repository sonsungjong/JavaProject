package _09_thread;

class DressRoom implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for (int i = 5; i >0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("dressroom 비우기"+(i*10)+"초 전");
			}
			System.out.println("비우기 완료");
		}
	}
}

public class Synchronized1 {
	public static void main(String[] args) {
		DressRoom dr = new DressRoom();
		
		Thread t1 = new Thread(dr, "첫번째");
		Thread t2 = new Thread(dr, "두번째");
		t1.start();
		t2.start();		
	}
}
