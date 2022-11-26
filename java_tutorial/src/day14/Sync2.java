package day14;

public class Sync2 {
	public static void main(String[] args) {
		DressRoom dressRoom = new DressRoom();
		Thread person1 = new Thread(dressRoom);
		Thread person2 = new Thread(dressRoom);
		Thread person3 = new Thread(dressRoom);
		
		person1.start();
		person2.start();
		person3.start();
	}
}

// 의상실은 한명이 사용 중이면 다른 사람들은 대기해야한다
// 동기화
class DressRoom implements Runnable{
	private int time;
	@Override
	public void run() {
		synchronized (this) {
			time = 0;
			System.out.println("탈의실 들어가기");
			while(time < 5) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				time++;
				System.out.println("탈의실 이용 중..."+time+"초");
			}
			System.out.println("탈의실 비움");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
