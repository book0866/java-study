package array;

public class Ex4 {

	public static void main(String[] args) {
		
		// 10개 크기 배열 생성
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 반복문으로 배열의 요소 하나씩 꺼내기
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// 람다식 for문: 반복문의 간결한 형태
		for (int value : arr) { // 변수 : 배열
			System.out.print(value + " ");
		}
				
	}

}
