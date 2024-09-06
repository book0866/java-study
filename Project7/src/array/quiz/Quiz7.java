package array.quiz;

import java.util.Arrays;

public class Quiz7 {

	public static void main(String[] args) {

		// System.arraycopy 메소드를 사용하여 배열을 복사하세요.
		// 원본 배열: {'a', 'b', 'c', 'd', 'e'}
		// 새 배열: {'d', 'e'}
		
		char[] arr = {'a', 'b', 'c', 'd', 'e'}; // 원본 배열
		char[] newArr = new char[2]; // 새로운 배열
		
		// 배열 복사하기
		// 원본 배열, 시작 위치, 새 배열, 시작 위치, 개수
		System.arraycopy(arr, 3, newArr, 0, 2);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
		
	}

}
