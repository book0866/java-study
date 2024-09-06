package loop.quiz;

public class Quiz10 {

	public static void main(String[] args) {

		// 중첩반복문을 사용해서 삼각형을 그려보세요.
		
		// <문제풀이>
		// 도형의 패턴을 찾아서 반복문과 조건문으로 표현
		// 첫 번째 줄: 별 1개
		// 두 번째 줄: 별 2개
		// 세 번째 줄: 별 3개
		// 네 번째 줄: 별 4개
		// 다섯 번째 줄: 별 5개
		
		for (int s = 1; s <= 5; s++) { // 세로(행)

			for (int t = 1; t <= s; t++) { // 가로(열)

				System.out.print("*");
			}

			System.out.println();

		}

	}

}
