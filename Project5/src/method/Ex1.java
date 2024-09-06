package method;

public class Ex1 {
	
	public static void method1() { // void: 리턴타입, method: 이름, (): 매개변수
		System.out.println("매개변수와 리턴타입이 둘 다 없는 메소드");
		return; // 리턴타입이 void이므로 생략 가능
	}
	
	public static String method2() { // String: 리턴타입 -> 문자열 반환
		return "매개변수가 없지만 반환값이 있는 메소드";
	}
	
	// 매개변수가 있고 반환값이 없는 메소드
	public static void method3(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum : " + sum);
	}
	
	// 매개변수가 있고 반환값이 있는 메소드
	public static int method4(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) { // 프로그램의 시작점: main 함수(브레이크 포인트를 여러 개 걸어도 제일 번저 디버깅 시작)
		
		method1();
		
		String str = method2();
		System.out.println(str);
		
		method3(1, 2);
		
		int i = method4(1, 2);
		System.out.println(i);
		
	}

}
