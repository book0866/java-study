package string.quiz;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		
		// Scanner 클래스의 nextLine 메소드를 사용하여 문자열을 입력받고,
		// "END" 또는 "end"가 입력되면 루프를 종료하세요.
		
		// 반복문을 제어할 때 쓰는 키워드
		// break: 반복문 종료
		// continue: 반복문 스킵
		
		Scanner scanner = new Scanner(System.in);
		
		// 무한 루프
		while (true) {
			System.out.println("문장을 입력하세요: ");
			
			String scan = scanner.nextLine();
			
			// 1)
			if (scan.equals("END") || scan.equals("end")) {
				break;
			}
			
			// 2)
//			if (scan.toLowerCase("END")) {
//				break;
//			}
			
			// 3)
			if (scan.equalsIgnoreCase("END")) {
				break;
			}
			
		}
		
	}

}

