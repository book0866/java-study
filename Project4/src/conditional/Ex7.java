package conditional;

public class Ex7 {

	public static void main(String[] args) {
		
		int time = 9;
		
		switch (time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		default: // if의 else와 같음(모든 조건에 부합하지 않는 나머지 결과)
			System.out.println("외근을 나갑니다.");
		}

	}

}
