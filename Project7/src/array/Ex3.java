package array;

public class Ex3 {

	public static void main(String[] args) {
		
		// 10개 크기의 정수형 배열 생성
		int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		// 배열의 요소를 하나씩 꺼내서 출력하기
//		System.out.println(intArr[0]); // 배열 이름[index]
//		System.out.println(intArr[1]);
//		System.out.println(intArr[2]);
//		System.out.println(intArr[3]);
//		System.out.println(intArr[4]);
//		System.out.println(intArr[5]);
//		System.out.println(intArr[6]);
//		System.out.println(intArr[7]);
//		System.out.println(intArr[8]);
//		System.out.println(intArr[9]);
		
		// for문으로 바꾸기
		// i를 index로 활용
		for(int i = 0; i < 10; i++) { // i<=9보다 i<10로 쓰는 게 좋음(배열의 크기를 알 수 있기 때문)
			System.out.println(intArr[i]);
		}
		
//		for(int i = 0; i <= 9; i++) {
//			System.out.println(intArr[i]);
//		}
		
		System.out.println(intArr.length);
		
		for(int i = 0; i < intArr.length; i++) { // 방 크기가 바뀌어도 바로 적용이 가능하기 때문에 유지보수에 용이
			System.out.println(intArr[i]);
		}
		
	}

}































