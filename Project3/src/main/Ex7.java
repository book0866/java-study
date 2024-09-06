package main;

public class Ex7 {

	public static void main(String[] args) {
		
		int x = 10; // 오른쪽의 값을 왼쪽 변수에 대입
		
		// 복합 대입연산자
		x += 10; // x = x + 10
		System.out.println(x); // 20
		
		x -= 5; // x = x - 5
		System.out.println(x); //15
		
		x *= 10; // x = x * 10
		System.out.println(x); //150
		
		x /= 10; // x = x / 10
		System.out.println(x); //15
		
		x %= 10; // x = x % 10
		System.out.println(x); //5
		
	}

}
