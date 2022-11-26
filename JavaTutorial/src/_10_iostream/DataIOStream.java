package _10_iostream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOStream {
	public static void main(String[] args) {
		FileOutputStream fo = null;
		FileInputStream fin = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			fo = new FileOutputStream("dataFile.txt");
			fin = new FileInputStream("dataFile.txt");
			dos = new DataOutputStream(fo);
			dis = new DataInputStream(fin);
			
			dos.writeShort(-1);
			dos.writeByte(2);
			dos.writeDouble(3.14);
			dos.writeLong(30);
			dos.writeUTF("datastream");
			
			System.out.println(dis.readUnsignedShort());
			dis.skip(1);
			System.out.println(dis.readDouble());
			System.out.println(dis.readLong());
			System.out.println(dis.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
				fo.close();
				dis.close();
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
