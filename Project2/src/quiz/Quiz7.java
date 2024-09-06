package quiz;

public class Quiz7 {

	public static void main(String[] args) {
		
		// 다음 코드를 보고 주석에 예상 결과를 작성하세요.
		double d = 1.2;
		float f = 0.9f;
		
		int i = (int) d; // 1 (1.2 -> 1)
		int i2 = (int) f; // 0 (0.9 -> 0)
		int i3 = (int) d + (int) f; // 1 (1 + 0 = 1)
		int i4 = (int) (d + f); // 2 (2.1 -> 2) ★형변환보다 (괄호 안에 있는 식)이 먼저이기 때문에 식 계산을 끝낸 후에 형변환★
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		
	}

}
