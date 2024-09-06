package main;

public class Ex2 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		arr[5] = 5; // 인덱스 범위를 벗어남. 크기가 5인 배열의 인덱스는 0~4까지만 있음(런타임 오류)
		
		// 에러가 발생하면 프로그램이 갑자기 종료됨
		
		// 마지막 문장 실행 안됨
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
	}

}





