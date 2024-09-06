package array.quiz;

import java.util.Arrays;

public class Quiz4 {

	public static void main(String[] args) {
		
		// 5개 크기의 정수형 배열을 생성하세요.
		int[] intArr = new int[5];
		
		System.out.println(Arrays.toString(intArr));
		
		// 반복문을 사용하여 숫자 1~10 중에서 짝수만 배열에 저장하세요.
		// [2, 4, 6, 8, 10]
		
		int sum = 0; // index로 사용할 변수 필요
		
		for(int i = 0; i <= 10; i++) {
			
			if(i % 2 == 0) { // i가 짝수라면 배열에 저장
				intArr[sum] = 1;
				sum++;
			}
		
		}
		
//		System.out.println(intArr); // intArr는 참조변수이므로 주소가 출력됨
		System.out.println(Arrays.toString(intArr)); // Arrays 클래스의 메소드 사용
		
	}

}
