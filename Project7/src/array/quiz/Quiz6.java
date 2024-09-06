package array.quiz;

public class Quiz6 {

	public static void main(String[] args) {
		
		// 5개 크기의 정수형 배열을 생성하고, 다음과 같이 초기화하세요
		// {5, 20, 100, 30, 77}
		int[] intArr = {5, 20, 100, 30, 77};
		
		// 20이 저장되어 있는 요소의 인덱스를 찾아서 출력하세요.
		// 예시) 20을 가지는 요소의 인덱스는 1입니다.
		
		for (int i = 0; i < 5 ; i++) {
			
			if (intArr[i] == 20) {
				System.out.println("20을 가지는 요소의 인덱스는 " + i + "입니다.");
				break; // 없어도 정상적으로 출력은 되는디???
			}
			
		}
		
	}

}
