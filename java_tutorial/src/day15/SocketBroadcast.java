package day15;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

public class SocketBroadcast {
	public static void main(String[] args) {
		BroadServer server = new BroadServer();
		server.start();
	}
}

class BroadServer extends Thread{
    private ServerSocket serverSocket;
    Socket socket;
    private Map<String, ChatHandler> handlers = new HashMap<>();
    
    @Override
    public void run() {
    	try {
            serverSocket = new ServerSocket(5000);
            while (true) {
                System.out.println("요청 대기");
                socket = serverSocket.accept();
                System.out.println("접속한 클라이언트 : " + socket.getInetAddress());

                String clientIP = socket.getInetAddress().toString();
                ChatHandler existingHandler = handlers.get(clientIP);
                
                if (existingHandler != null && !existingHandler.socket.isClosed()) {
                    existingHandler.sendMessage(socket);
                }else {
                	ChatHandler handler = new ChatHandler(socket);
                	handlers.put(clientIP, handler);
                    handler.start();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ChatHandler extends Thread{
	private InputStream is;
    private OutputStream os;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    Socket socket;
    
    public ChatHandler(Socket socket) {
        this.socket = socket;
    }
    
    @Override
    public void run() {
    	try {
            is = socket.getInputStream();
            os = socket.getOutputStream();
            ois = new ObjectInputStream(is);
            oos = new ObjectOutputStream(os);

            while (true) {
                String msg = (String) ois.readObject();
                String clientIP = socket.getInetAddress().toString();
                System.out.println(clientIP+ " 클라이언트의 메시지 : " + msg);
                String retMsg = "서버로부터 되돌아온 메시지 : " + msg;
                oos.writeObject(retMsg);
            }
        } catch (SocketException e) {
            System.out.println("클라이언트가 연결을 종료했습니다: "+socket.getInetAddress());
        } catch(Exception e) {
        	e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (oos != null) {
                    oos.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void sendMessage(Socket socket) {
        try {
            is = socket.getInputStream();
            os = socket.getOutputStream();
            ois = new ObjectInputStream(is);
            oos = new ObjectOutputStream(os);

            String msg = (String) ois.readObject();
            System.out.println("클라이언트의 메시지 : " + msg);
            String retMsg = "서버로부터 되돌아온 메시지 : " + msg;
            oos.writeObject(retMsg);
            //socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}