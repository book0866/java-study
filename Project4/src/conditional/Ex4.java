package conditional;

public class Ex4 {

	public static void main(String[] args) {
		
		int rank = 2; // 순위
		
		// 변수와 값이 일치하는 case문을 실행한다.
		switch (rank) {
		case 1 : // rank 값이 1이면 (rank == 1 이라는 조건식과 같음)
			System.out.println("메달의 색은 금입니다.");
			break;
		case 2 : // rank 값이 2면
			System.out.println("메달의 색은 은입니다.");
			break;
		case 3 : // rank 값이 3이면
			System.out.println("메달의 색은 동입니다.");
			break;
		default: // 변수와 일치하는 값이 없으면
			System.out.println("메달이 없습니다.");
		}
		
	}

}
