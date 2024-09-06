package string.quiz;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		
		// Scanner 클래스의 nextLine 메소드를 사용하여 문자열을 입력받고,
		// 문자열을 거꾸로 뒤집어서 출력하세요.
		// ex) "안녕하세요" => "요세하녕안"
		
		Scanner scanner = new Scanner(System.in);
		
		String scan = scanner.nextLine();
		
		for (int i = 4; i >= 0; i--) {
			System.out.print(scan.charAt(i));
		}
		
	}

}







