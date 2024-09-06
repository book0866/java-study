package main.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		
		// 다음 코드를 실행하면 에러가 발생합니다.
		// 프로그램이 정상적으로 종료되도록 예외를 처리하세요.

		Object obj = new Integer(0);
		
		try {
			
			String str = (String) obj; // 잘못된 타입으로 형변환됨
			
		} catch (ClassCastException e) {

			System.out.println(e);
		
		}
		
		System.out.println("프로그램이 정상 종료됩니다.");
		
	}

}
