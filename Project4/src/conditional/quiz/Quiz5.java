package conditional.quiz;

public class Quiz5 {

	public static void main(String[] args) {
		
		// 월을 저장할 변수를 선언하고, 1~12 사이의 값을 저장하세요.
		int month = 2;
		
		// 그리고 월에 해당하는 계절을 출력하세요.		
		if (month >= 3 && month <= 5) { // 3~5월은 "현재 계절은 봄입니다."
			System.out.println("현재 계절은 봄입니다.");
		} else if (month >= 6 && month <= 8) { // 6~8월은 "현재 계절은 여름입니다."
			System.out.println("현재 계절은 여름입니다.");
		} else if (month >= 9 && month <= 11) { // 9~11월은 "현재 계절은 가울입니다."
			System.out.println("현재 계절은 가울입니다.");
		} else if (month <= 2 || month == 12) { // 12~2월은 "현재 계절은 겨울입니다." 혹은 (month == 1 || month == 2 || month == 12)
			System.out.println("현재 계절은 겨울입니다.");
		} else { // 이외는 "월이 잘못되었습니다."
			System.out.println("월이 잘못되었습니다.");
		}
		
	}

}
