package array;

public class Ex2 {

	public static void main(String[] args) {
		
		// 3개 크기의 정수형 배열 생성
		int[] arr = new int[3];
		
		// 배열 방 번호(index)는 0번부터 시작
		arr[0] = 10; // 배열의 첫 번째 요소에 10 저장
		arr[1] = 20;
		arr[2] = 30;
//		arr[3] = 40; // index 범위 벗어나면 에러남
		
		// 배열의 두 번째 요소값을 가져와서 value에 저장
		int value = arr[2];
		System.out.println(value);
		
	}

}
