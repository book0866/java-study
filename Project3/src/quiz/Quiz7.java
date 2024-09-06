package quiz;

public class Quiz7 {

	public static void main(String[] args) {

		boolean result1 = (1 == 2) || (1 < 2); // 1은 2와 같거나 작다: 뒷 항이 참이므로 true
		boolean result2 = true && false; // 둘 중 하나가 거짓이므로 false
		boolean result3 = !false; // 반대니까.......... true
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		int x = 1;
		int y = 5;
		boolean result4 = (x < y) || (x == y); // x는 y보다 작거나 같다: 앞 항이 참이므로 true
		
		System.out.println(result4);
		
		// 연산자의 우선순위
		// 대입연산자(=)는 항상 마지막
		// 비교연산자 > 논리연산자
	}

}
