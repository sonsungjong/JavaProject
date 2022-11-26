package _09_thread;

import java.util.Scanner;

public class Runner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("선수 숫자: ");
		int run = sc.nextInt();
		for (int i = 0; i < run; i++) {
			Thread running = new Runner(i+1+"번");
			running.start();}}}

class Runner extends Thread{
	String name;
	int distance;
	Runner(String name){this.name = name;}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			distance+=10;
			if(distance == 100) {
				System.out.println(this.name + " 도착");
			}else {
				System.out.println(name + "번이 "+distance+ "M 도착");
			}
			try {
				int num = (int)(Math.random()*1000);
				sleep(num);
			}catch(Exception e) {
				e.printStackTrace();
			}}}}