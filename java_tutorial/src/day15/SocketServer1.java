package day15;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer1 extends Thread{
	private InputStream is;
	private OutputStream os;
	private ServerSocket serverSocket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	Socket socket;
	
	@Override
	public void run() {
		try {
			serverSocket = new ServerSocket(5000);
			while(true) {
				System.out.println("요청 대기");
				socket = serverSocket.accept();
				System.out.println("접속한 클라이언트 : "+socket.getInetAddress());
				is = socket.getInputStream();
				os = socket.getOutputStream();
				ois = new ObjectInputStream(is);
				oos = new ObjectOutputStream(os);
				String msg = (String)ois.readObject();
				System.out.println("클라이언트의 메시지 : "+msg);
				String retMsg = "서버로부터 되돌아온 메시지 : "+msg;
				oos.writeObject(retMsg);
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SocketServer1 server = new SocketServer1();
		server.start();
	}
}
