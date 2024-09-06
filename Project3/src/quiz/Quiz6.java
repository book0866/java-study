package quiz;

public class Quiz6 {

	public static void main(String[] args) {
				
		// 1. 7이 홀수가 맞는지 확인하고, 결과를 출력하세요.
				
		int value1 = 7 % 2; // 나머지 구하기
		boolean result1 = (value1 == 1); // 나머지가 1인지 확인
		System.out.println("7은 홀수이다: " + result1);
		
		// 2. 10이 짝수가 맞는지 확인하고, 결과를 출력하세요.
		int value2 = 10 % 2;
		boolean result2 = (value2 == 0);
		System.out.println("10은 짝수이다: " + result2);

	}

}
