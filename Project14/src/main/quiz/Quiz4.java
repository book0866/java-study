package main.quiz;

public class Quiz4 {

	public static void main(String[] args) {
		
		// 다음 코드를 실행하면 에러가 발생합니다.
		// 프로그램이 정상적으로 종료되도록 예외를 처리하세요.

		String str = "1.23";
		
		try {
			
			 // parseInt(): 문자열 -> 숫자 변환
			int num = Integer.parseInt(str); // 실수를 정수로 변환하려고 해서 에러남
			
		} catch (NumberFormatException e) {
			
			System.out.println(e);
			
		}
		
		System.out.println("프로그램이 정상 종료됩니다.");
		
	}

}
