package loop.quiz;

public class Quiz6 {

	public static void main(String[] args) {
		
		// for문을 사용해 1부터 100까지 더하는 코드를 작성하세요.
		// 단, 중간에 합이 500이 넘어가면 중단합니다.
		// for문이 종료되기 전 num과 sum의 값을 출력하세요.
		// *break문을 사용할 것.
		
		int sum = 0;
		int num;
		
		for (num = 1; num <= 100; num++) {
			sum = sum + num;
			
			if (sum >= 500) {
//				System.out.println("num " + num + " | sum " + sum); // for문 안에 변수 선언 후 if문과 break 사이에 프린트해도 됨
				break;
			}
		}
		System.out.println("num " + num + " | sum " + sum);
	}

}
