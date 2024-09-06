package reference;

public class Ex2 {

	public static void main(String[] args) {
		
		// 기본형 변수
		int num1 = 1;
		int num2 = 1;
		boolean result1 = (num1 == num2); // 값만 비교
		System.out.println(result1);
		
		// 참조형 변수
		Subject math1 = new Subject("수학", 85);
		Subject math2 = new Subject("수학", 85);
		boolean result2 = (math1 == math2); // 주소를 비교
		System.out.println(result2);
		
	}

}
