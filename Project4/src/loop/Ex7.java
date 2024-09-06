package loop;

public class Ex7 {

	public static void main(String[] args) {
		
		int sum = 0;
		// (초기화식; 조건식; 증감식)
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
	}

}
