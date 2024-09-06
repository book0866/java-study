package main.quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		
		// 다음 코드를 실행하면 에러가 발생합니다.
		// 프로그램이 정상적으로 종료되도록 예외를 처리하세요.
		// + 에러의 원인까지 기입
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		// "abc"를 입력하세요.
		
		try {
			
			int num = scanner.nextInt(); // nextInt(): 정수값을 입력받음 -> 콘솔창에 정수를 입력해야 하는데 문자열을 입력하라고 지시함
			
		} catch (InputMismatchException e) {

			System.out.println(e);
			
		}
		
	}

}
