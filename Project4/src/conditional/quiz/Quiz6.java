package conditional.quiz;

public class Quiz6 {

	public static void main(String[] args) {
		
		// 학생의 점수를 저장할 변수를 선언하고 0~99 사이의 값을 저장하세요.
		int score = 75;
		
		if (score >= 90 && score <= 99) { // 점수가 90~99이면 "수"
			System.out.println("수");
		} else if (score >= 80 && score <= 89) { // 점수가 80~89이면 "우"
			System.out.println("우");
		} else if (score >= 70 && score <= 79) { // 점수가 70~79이면 "미"
			System.out.println("미");
		} else { // 그 외에는 "양"을 출력하세요.
			System.out.println("양");
		}
		// 100점도 양 아이가
		
		// 이게 더 간단함. 두 번째 조건부터는 최소값만 표시해도 됨
		if (score >= 90 && score <= 99) { // 점수가 90~99이면 "수"
			System.out.println("수");
		} else if (score >= 80) { // 점수가 80~89이면 "우"
			System.out.println("우");
		} else if (score >= 70) { // 점수가 70~79이면 "미"
			System.out.println("미");
		} else { // 그 외에는 "양"을 출력하세요.
			System.out.println("양");
		}
		
	}

}
