package method;

public class Ex3 {
	
	// 숫자 1부터 10까지 출력하는 함수 선언(출력만 하기 때문에 돌려줄 값이나 매개변수가 x)
	public static void printTen() {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		printTen(); //  함수 호출: 함수이름();
		
	}

}
