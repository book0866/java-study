package method.quiz;

public class Quiz7 {
	
	// 세 자리 정수의 각 자리수의 합을 구하는 메소드를 만들고 호출하세요.
	
	public static void plus(int num) {
		
		int one = 0;
		
		one = one + (num % 10); // 1의 자리
//		System.out.println(one);
		
		num = num / 10; // 10의 자리
		one = one + (num % 10);
//		System.out.println(one);
		
		num = num / 10; // 100의 자리
		one = one + (num % 10);
		System.out.println(one);
	}
	
	public static void main(String[] args) {
		
		plus(932); // 9 + 3 + 2 = 14
		
	}

}
