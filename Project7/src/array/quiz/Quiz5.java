package array.quiz;

public class Quiz5 {

	public static void main(String[] args) {
		
		// 5개 크기의 정수형 배열을 생성하고, 다음과 같이 초기화하세요.
		// {5, 20, 100, 30, 77}
		int[] intArr = {5, 20, 100, 30, 77};
		
		// 배열에서 가장 큰 값을 찾으세요.
		// 답: 100
		
		int num = 0;
		
		for (int i = 0; i < 5 ; i++) {
			
			if(intArr[i] > num) {
				num = intArr[i];
			}
			
		}
		
		System.out.println(num); // 흐윽...흑흑....흐으으윽..................어.....려.......우 ㅓ.........................

	}

}
