package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex7 {

	public static void main(String[] args) throws IOException {
		
		// 스트림 변수 선언
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("src/main/a.txt");
			System.out.println("a.txt 파일을 엽니다.");
			
//			int i = 10/0;
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
			
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
			
		} finally { // 에러 발생 여부와 상관없이 항상 수행되는 블록
			
			fis.close();
			System.out.println("사용한 리소스를 닫았습니다.");
			
		}
		
		System.out.println("프로그램을 정상 종료합니다.");
		
	}

}
