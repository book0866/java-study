package loop.quiz;

public class Quiz5 {

	public static void main(String[] args) {
		
		// 1부터 100까지의 수 중에서 3의 배수만 출력하세요.
		
		int i; // for문 바깥에 i(변수)를 선언하고 for문 안에서는 초기화만 하는 게 좋음. 초기화와 선언 동시에 하면 for문 밖에서는 i(변수)를 사용할 수 없기 때문)
		// continue 썼을 때
		for (i = 1; i <= 100; i++) { 
			if (i % 3 != 0) {  // i가 3의 배수가 아니면 다음 코드를 스킵
					continue; // != : 부정 = 다르다(i의 나머지가 3이 아니면 true)
			}
			System.out.println(i);
			
		}
		// continue 안 썼을 때
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {  // i가 3의 배수가 아니면 다음 코드를 스킵
//		System.out.println(i);
//			}
//		}
	}

}
