package quiz;

public class Quiz5 {

	public static void main(String[] args) {
		
		int me = 30;
		
		// 1. 본인의 나이가 40세 이하라면 true를 출력하세요.
		boolean result7 = (me <= 40);
		System.out.println("나는 40세 이하이다: " + result7);
		
		// 2. 본인의 나이가 40세가 맞다면 true를 출력하세요.
		boolean result8 = (me == 40);
		System.out.println("나는 40세이다: " + result8);
		
		// 3. 본인의 나이가 40세가 아니라면 true를 출력하세요.
		boolean result9 = (me != 40);
		System.out.println("나는 40세가 아니다: " + result9);

	}

}
