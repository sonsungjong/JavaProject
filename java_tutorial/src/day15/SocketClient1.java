package day15;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class SocketClient1{
	InputStream is;
	OutputStream os;
	Socket socket;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Scanner sc;
	String rMsg;
	
	public void mystart() {
		try {
			socket = new Socket("127.0.0.1", 5000);
			sc = new Scanner(System.in);
			os = socket.getOutputStream();
			is = socket.getInputStream();
			oos = new ObjectOutputStream(os);
			ois = new ObjectInputStream(is);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			sendMessage(socket);
			receiveMessage(socket);
		}
	}
	
	private void receiveMessage(Socket socket) {
		rMsg = "";
		try {
			rMsg = (String)ois.readObject();
			System.out.println(rMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void sendMessage(Socket socket) {
		try {
			System.out.print("보낼 메시지>>");
			if(sc.hasNextLine()) {
				String sMsg = sc.nextLine();
				oos.writeObject(sMsg);
				oos.flush();				
			}else {
				System.out.println("입력이 없습니다.");				// nextLine 버그 방지
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SocketClient1 client = new SocketClient1();
		client.mystart();
	}
}
