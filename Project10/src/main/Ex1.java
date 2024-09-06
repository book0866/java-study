package main;

public class Ex1 {

	public static void main(String[] args) {
		
		// 인터페이스는 객체를 생성할 수 없음!
//		Calc calc = new Calc();
		
		Calculator calculator = new Calculator();
		
		int result = calculator.add(10, 5); // 리턴 값의 변수를 하나 만들고 함수 호출
		System.out.println(result);
		// ↓ 간단한 버전
		System.out.println(calculator.add(10, 5));
		System.out.println(calculator.subscript(10, 5));
		System.out.println(calculator.times(10, 5));
		System.out.println(calculator.divide(10, 5));

	}

}

// 계산기의 구현 클래스
class Calculator implements Calc { // 인터페이스를 상속받을 때는 implements

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int subscript(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
	
}






















