package _09_thread;

class ThreadFirst extends Thread
{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("++++쓰레드1++++");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadSecond extends Thread
{
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println("====쓰레드2====");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread2 {
	public static void main(String[] args) {
		ThreadFirst tf = new ThreadFirst();
		ThreadSecond tc = new ThreadSecond();
		
		tf.start();
		tc.start();
	}
}

// 프로세스 : 실행되고 있는 프로그램 하나
// 쓰레드 : 프로세스 안에서 실질적인 작업을 처리
// 하나의 프로세스(프로그램)이 배경음악, 채팅, 출력을 동시에 하기 위해선 3개의 쓰레드가 필요