package main;

public class Ex2 {

	public static void main(String[] args) {
		
//		int x = 100;
//		int y = x++; // y에 x의 값을 대입한 후 1만큼 증가
//		int z = x--;
//		
//		System.out.println(x); // 100
//		System.out.println(y); // 100
//		System.out.println(z); // 101
		
		// 증감연산자가 변수의 앞에 있을 때
		int x = 100;
		int y = ++x; // x의 값을 1만큼 증가시킨 후 y에 대입
		int z = --x;
		
		System.out.println(x); // 100
		System.out.println(y); // 101
		System.out.println(z); // 100
		
		// 디버그 모드
		// f6: 한 줄씩 실행
		// f8: 다음 브레이크 지점으로 스킵
		
	}

}
