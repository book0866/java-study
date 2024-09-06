package main;

public class Ex3 {

	public static void main(String[] args) {
		
//		Calculator calculator = new Calculator(); // 기존 계산기 코드
		
		Calc calculator = new NewCalculator(); // 변경한 계산기 코드
	
		System.out.println(calculator.add(10,5));
		System.out.println(calculator.subscript(10,5));
		System.out.println(calculator.times(10,0));
		System.out.println(calculator.divide(10,20));
		
	}

}


class NewCalculator implements Calc {

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
		if (num2 > 0) {
			return num1 * num2;
		} else {
			return Calc.ERROR;
		}
	}
	
	// 첫 번째 숫자가 두 번째 숫자보다 더 작으면 에러코드 반환
	@Override
	public int divide(int num1, int num2) {
		if (num1 > num2) {
			return num1 / num2;
		} else {
			return Calc.ERROR;
		}
	}
	
}










