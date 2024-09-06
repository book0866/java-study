package conditional.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		// int형 변수를 선언하고 값을 대입하세요.
		int i = 5;
		
		// 조건문을 사용해서 변수의 값이 2의 배수거나 3의 배수라면
		// "2 또는 3의 배수입니다."를 출력하세요.
		if ((i % 2 == 0) || (i % 3 == 0)) {
			System.out.println(i + "는 2 또는 3의 배수입니다.");
		}
		
	}

}
