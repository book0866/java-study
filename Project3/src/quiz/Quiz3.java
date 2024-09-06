package quiz;

public class Quiz3 {

	public static void main(String[] args) {
		
		// 변수 num을 선언하고 456을 저장하세요.
		int num = 456;
		
		// 그리고 백의 자리 이하를 버린 값을 구하세요.(예시: 456 -> 400)
		System.out.println(num - (num % 400));
		
		// 정론↓
		int result = num / 100 * 100;
		
		System.out.println("결과: " + result);
		
		
	}

}
