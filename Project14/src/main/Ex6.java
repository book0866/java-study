package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex6 {

	public static void main(String[] args) {
		
		// FileInputStream: 파일을 열어서 읽고 쓰는 입력 클래스
		
		try {
			
			FileInputStream fis = new FileInputStream("src/main/a.txt");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
		System.out.println("프로그램이 정상 종료됩니다.");
		
	}

}
