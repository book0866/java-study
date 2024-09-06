package main.quiz;

public class Quiz2 {

	public static void main(String[] args) {

		// 다음 코드를 실행하면 에러가 발생합니다.
		// 프로그램이 정상적으로 종료되도록 예외를 처리하세요.
		
		String s = null; // 참조변수를 선언만 하고 생성은 안 함
		
		try {
			
			System.out.println(s.length()); // 빈 객체를 참조하여 에러남
			
		} catch (NullPointerException e) {
			
			System.out.println(e);
			
		}

		System.out.println("프로그램이 정상 종료됩니다.");
		
	}

}
