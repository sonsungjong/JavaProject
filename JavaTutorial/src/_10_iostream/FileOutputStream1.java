package _10_iostream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {
	public static void main(String[] args) {
		FileOutputStream fout = null;
		String msg = "헬로우 자바 ";
		byte[] byteArray = msg.getBytes();
		
		try {
			fout = new FileOutputStream("c:\\data\\testFile0.txt", true);
			fout.write(byteArray);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
