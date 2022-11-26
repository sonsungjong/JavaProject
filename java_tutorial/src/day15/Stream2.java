package day15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Stream2 {
	public static void main(String[] args) {
		MakeFile mf = new MakeFile();
		//mf.make("C:\\");
		//mf.putText("C:\\myText.txt");
		mf.readText("C:\\myText.txt");
	}
}

class MakeFile{
	
	// 파일 만들기
	public int make(String path) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 파일 이름을 입력하세요(확장자까지) >>");
		String fileName = sc.next();
		File makeFile = new File(path + fileName);			// "C:\\myText.txt"
		
		try {
			makeFile.createNewFile();			// 새 파일 만들기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일 생성에 실패했습니다.");
			return -1;			// 파일 생성에 실패했을 경우 메서드를 종료하면서 -1을 리턴
		}
		
		if(makeFile.exists()) {
			System.out.println("파일 생성 완료!");
		}
		return 1;
	}
	
	// 파일 삭제하기
	public int delete(String path) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 파일 이름을 입력하세요(확장자까지) >>");
		String fileName = sc.next();
		File file = new File(path + fileName);			// "C:\\myText.txt"
		// delete : 삭제성공하면 true를 리턴, 삭제 실패하면 false 리턴
		if(file.delete()) {
			System.out.println("삭제 성공!");
			return 1;
		}else {
			System.out.println("삭제 실패ㅠㅠ");
			return -1;
		}
	}
	
	// 파일 내용 입력하기(OutputStream)
	public void putText(String file) {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(file, true);
			Scanner sc = new Scanner(System.in);
			System.out.println("입력할 내용 >>");
			String msg = sc.nextLine()+"\n";			// 문자열
			// 파일은 '바이트' 단위, 문자열->바이트
			byte[] byteArray = msg.getBytes();		// String -> byte[]
			
			fout.write(byteArray);					// 파일 쓰기
			System.out.println("내용 입력 완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("내용 입력 실패");
		}finally {
			// try나 catch 수행후에 실행될 문장
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// 파일 내용 읽어오기 (InputStream)
	public void readText(String file) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(file);
			// 버퍼 변환 UTF-8 (한글)
			InputStreamReader isr = new InputStreamReader(fin, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			String msg = null;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 읽기 실패 ㅠㅠ");
		}finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
