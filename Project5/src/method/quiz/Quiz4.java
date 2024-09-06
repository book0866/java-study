package method.quiz;

public class Quiz4 {

	// 빼기 메소드를 만들고 호출하세요.
	//두 수를 입력받아 첫 번째 수에서 두 번째 수를 뺀 후 그 결과를 반환하세요.
	// 단, 첫 번째 수가 두 번째 수보다 작으면 -999를 반환하고 함수를 종료하세요.
	public static int decline(int n1, int n2) {
		
		int i = 0;
		i = n1 - n2;
		
		if (n1 < n2) { // if ~ else 써도 됨
			i = -999;
			return i;
		}
		return i;
	}

	public static void main(String[] args) {
		
		int i = decline(10, 20);
		System.out.println(i);

	}

}
