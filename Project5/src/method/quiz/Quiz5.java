package method.quiz;

public class Quiz5 {
	
	// 나누기 함수를 만들고 호출하세요.
	public static void divide(int n1, int n2) {
		// 두 수를 입력받아 첫 번째 수에서 두 번째 수를 나눈 몫을 출력하세요.
		// 단, 두 번째 수가 0이면 "나누는 수는 0이 될 수 없습니다"를 출력하고 함수를 종료하세요.
		if (n2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return; // ★return 타입이 void여도 return 사용 가능.(함수 종료 용도)★
		}
		
		int result = n1 / n2;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		divide(10, 0);
		
	}

}
