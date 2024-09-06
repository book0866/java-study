package method.quiz;

public class Quiz1 {
	
	// 사칙연산을 수행하는 함수를 만들고 호출하세요.
	// 두 숫자를 입력받아 것셈, 뺄셈, 곱셈, 나눗셈, 나머지를 출력하세요.
	public static void sum(int num1, int num2) {
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	}

	public static void main(String[] args) {
		
		sum(10, 5);

	}

}
