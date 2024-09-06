package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex8 {

	public static void main(String[] args) {
		
		// 메소드를 호출하는 쪽에서 예외처리를 해야 함
		
		try {
			
			openTextFile();
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		
		}
		
	}
	
	// 인스턴스 없이 만들고 싶으면 static 사용
	public static void openTextFile() throws FileNotFoundException { // throws + 에러 클래스 이름
		
		FileInputStream fis = new FileInputStream("src/main/a.txt");
		
		
	}

}
