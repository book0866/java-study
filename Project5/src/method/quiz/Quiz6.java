package method.quiz;

public class Quiz6 {
	
	// 계산기 메소드를 만들고 호출하세요.
	
	public static void calculator(int n1, int n2, char c) {
		
		// 두 수와 연산자(+ - * /) 중에 하나를 입력받아, 연산을 수행하고 결과를 출력하세요.

		int result = 0;
		// switch문
		switch (c) {
		case '+' : 
			result = n1 + n2;
			System.out.println(result);
			break;
		case '-' : 
			result = n1 - n2;
			System.out.println(result);
			break;
		case '*' : 
			result = n1 * n2;
			System.out.println(result);
			break;
		case '/' : 
			result = n1 / n2;
			System.out.println(result);
			break;
		}
		
		// if문
		if (c == '+') {
			result = n1 + n2;
			System.out.println(result);
		} else if (c == '-') {
			result = n1 - n2;
			System.out.println(result);
		} else if (c == '*') {
			result = n1 * n2;
			System.out.println(result);
		} else if  (c == '/') 
			System.out.println(result);
		}
	
	

	public static void main(String[] args) {
		
		calculator(1, 5, '+');
		calculator(6, 2, '-');
		calculator(2, 5, '*');
		calculator(10, 2, '/');
		
	}

}
