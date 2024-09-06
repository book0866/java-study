package loop;

public class Ex9 {

	public static void main(String[] args) {
		
		// 1부터 20까지 더하다가, 합이 100을 넘어가면 반복문을 중단하기
		int sum = 0;
		int i; // for문 밖에서 선언
		
		// break는 특정조건에서 빠져나와야 할 때 사용할 것
		for (i = 1; i <= 20; i++) {  // 선언 X. 초기화만 함
			sum = sum + i;
			
//			System.out.println("i : " + i + ", sum : " + sum); // 헷갈리면 프린트 명령어로 확인
			
			if (sum >= 100) { // 합이 100을 넘으면 for문 종료
				break;
			}
		}
		System.out.println("i : " + i);
		System.out.println("sum : " + sum);
		
	}

}
