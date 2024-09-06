package main;

public class Ex10 {

	public static void main(String[] args) {
		
		// 정수형의 강제 형변환
		int i = 1000;
		byte b = (byte) i; // int(4) -> byte(1)
		System.out.println(b); // -24. 값이 손실됨
		
		// 실수형의 강제 형변환
		double d = 1.2;
		float f = (float) d; // double(8) -> float(4)
		
		// 정수형과 실수형의 강제 형변환
		int i2 = (int) f; // int(4) -> float(4)
		System.out.println(i2); // 1. 실수 -> 정수이므로 소수점 밑자리를 잃음
		
		
//		타입이 다른데 값을 복사하고 싶을 때 강제 형변환을 사용
		
//		float f = 3.14f;
		
//		float의 값을 i에 복사하고 싶
//		nt i = (int) f;
		
	}

}
