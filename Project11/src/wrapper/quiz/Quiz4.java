package wrapper.quiz;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		
		// Scanner 클래스의 nextLine 메소드를 사용하여 정수 두 개를 입력받으세요.
		// 그리고 두 수를 더한 결과를 출력하세요.
		// ex) 10, 5 => 15
		Scanner scan = new Scanner(System.in);
		
		String no1 = scan.nextLine();
		String no2 = scan.nextLine();
		
		System.out.println(no1 + no2); // 105
		
		// 문자열을 숫자로 변환하고 더하기: "10" + "5" -> 10 + 5
		int sum = Integer.parseInt(no1) + Integer.parseInt(no2);
		System.out.println("no1과 no2의 합: " + sum);

	}

}
