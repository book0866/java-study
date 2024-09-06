package string.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 주민등록번호 뒷자리의 맨 첫 번째 숫자는 성별을 나타냅니다.
		// 주민등록번호를 입력하면 성별을 출력하도록 구현하세요.
		// ex) "881120-1068234" -> "성별은 남자입니다."
		// 1, 3 -> 남자
		// 2, 4 -> 여자
		
		String num = "881120-1068234";
		
		char g = num.charAt(7);
		
		if (g == '1' || g == '3') {
			System.out.println("성별은 남자입니다.");
		} else if (g == '2' || g == '2'){
			System.out.println("성별은 여자입니다.");
		} else {
			System.out.println("잘못된 값입니다");
		}
		
	}

}
