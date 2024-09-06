package main;

public class Ex4 {

	public static void main(String[] args) {
		
		// 정수형 변수는 양수 or 음수 or 0 지정 가능
		byte  b = 10;
		short s = 10;
		int i = 200;
		long l = 10;
		l = 12345678900l; // long 타입에는 식별자를 붙여야함!
		// int형 범위를 넘어가면 식별자를 붙여야 함
		
		// 서로 다른 타입의 변수끼리 계산 가능 (ex. short + byte)
		System.out.println( s + b );
		// short + byte -> int + int = 10 + 10 = 20
		// 컴퓨터가 변환을 한 번 더 해야 하기 때문에 아무튼간에 int형을 쓰는 게 좋음
		
	}

}


