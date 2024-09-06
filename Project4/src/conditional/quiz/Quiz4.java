package conditional.quiz;

public class Quiz4 {

	public static void main(String[] args) {
		
		// 정수형 변수 i를 선언하고 숫자 값을 대입하세요.
		int i = 95;
		
		// 그리고 i가 100<i<200 범위에 속해 있다면 "i는 100 이상 200 이하입니다."라는 메세지를 출력하세요.
		// 그렇지 않다면 "i는 100보다 작거나 200보다 큽니다." 라는 메세지를 출력하세요.
		if ((i >= 100) && (i <= 200)) {
				System.out.println("i는 100 이상 200 이하입니다.");
		} else {
				System.out.println("i는 100보다 작거나 200보다 큽니다.");
		}
		
	}

}
