package _11_network;

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
//			socket = new Socket("14.37.81.250", 5000);
			socket = new Socket("127.0.0.1", 5000);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendMessage(socket);
		receiveMessage(socket);
	}
	
	private void receiveMessage(Socket socket) {
		try {
			is = socket.getInputStream();
			ois = new ObjectInputStream(is);
			rMsg = (String)ois.readObject();
			System.out.println(rMsg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void sendMessage(Socket socket) {
		try {
			os = socket.getOutputStream();
			oos = new ObjectOutputStream(os);
			sc = new Scanner(System.in);
			System.out.print("보낼 메시지>>");
			String sMsg = sc.nextLine();
			oos.writeObject(sMsg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SocketClient1 client = new SocketClient1();
		while(true) {
			client.mystart();
		}
	}
}
