package _10_iostream;

import java.io.File;
import java.io.FilenameFilter;

public class File2 {
	public static class ImageNameFilter implements FilenameFilter{
		@Override
		public boolean accept(File dir, String name) {
			return name.endsWith(".jpg");			// 끝문자가 .jpg
		}
	}
	
	public static void main(String[] args) {
		File file = new File("C:\\Users\\user\\Desktop\\docs");				// 생성자에 경로
		System.out.println("c: 드라이브의 jpg파일만 출력");
		String[] imageFiles = file.list(new ImageNameFilter());
		
		for(String fileName:imageFiles) {
			File subFile = new File(file, fileName);
			System.out.println("파일명: "+fileName + ", 파일크기: "+subFile.length()+ "byte, 파일경로: "+subFile.getAbsolutePath());
		}
	}
}
