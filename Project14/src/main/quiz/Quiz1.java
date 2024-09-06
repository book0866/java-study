package main.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 다음 코드를 실행하면 에러가 발생합니다.
		// 프로그램이 정상적으로 종료되도록 예외를 처리하세요.
		
//		int num = 5/0;
		
		try {
			
			int num = 5/0;
			
		} catch (ArithmeticException e) {
			
			System.out.println(e.getMessage()); // 에러 메세지만 출력
			e.printStackTrace(); // 에러 메세지와 에러의 위치를 함께 출력
			
		}
		
		System.out.println("프로그램이 정상 종료됩니다.");

	}

}
