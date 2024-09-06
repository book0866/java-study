package main;

public class Ex6 {

	public static void main(String[] args) {
		
		boolean result1 = (5 > 0) && (10 > 0); // true && true
		boolean result2 = (5 > 0) && (10 < 0); // true && false: &&은 모두가 참이어야 true
		boolean result3 = (5 > 0) || (10 > 0); // true || true: 앞 항이 참이면 어차피 결과가 true이기 때문에 뒷 항을 계산하지 않음
		boolean result4 = (5 > 0) || (10 < 0); // true || false: ||은 하나라도 참이면 true(위와 같음)
		boolean result5 = !(5 > 0); // !(true)
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
	}

}
