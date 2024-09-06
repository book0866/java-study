package loop.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 11부터 20까지 합을 구하고 출력하세요.
		int num = 11;
		int sum = 0; // 누적값 초기화
		
		while (num <= 20) {
			sum = sum + num;
			num++;
		}
		
		System.out.println(sum);
		
	}

}
