package array;

import java.util.Arrays;

public class Ex5 {

	public static void main(String[] args) {
		
		char[] srcArr = {'a', 'b', 'c', 'd', 'e'}; // 원본
		char[] newArr = new char[3]; // 새로운 배열
		
		// 배열 복사하기
		// 원본 배열, 시작 위치, 새 배열, 시작 위치, 개수
		System.arraycopy(srcArr, 0, newArr, 0, 3);
		
		System.out.println("원본 배열: " + Arrays.toString(srcArr));
		System.out.println("새로운 배열: " + Arrays.toString(newArr));
		
	}

}
