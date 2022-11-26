package _10_iostream;

import java.io.File;
import java.io.IOException;

public class File1 {	
	public static void main(String[] args) {
		System.out.println("c:드라이브 전체 파일 출력");
		File file = new File("C:\\");			// 경로
		String[] files = file.list();
		for(String fileName : files) {
			File subFile = new File(file, fileName);
			if(file.isDirectory()) {
				System.out.println("디렉토리 이름: "+fileName);
			}else {
				System.out.println("파일 이름: "+fileName + "파일크기: "+subFile.length()+ "byte");
			}
		}
		
		File makeFile = new File("c:\\data\\testFile.txt");
		try {
			makeFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(makeFile.exists()) {
			System.out.println("makeFile 생성됨");
		}
		
		
//		File renameFile = new File("c:\\data\\testFile2.txt");
//		makeFile.renameTo(renameFile); if(renameFile.exists()) {
//		System.out.println("makeFile 이름변경됨"); }
//		
//		if(renameFile.delete()) { System.out.println("renameFile 삭제"); }
		 
		 
	}
}
