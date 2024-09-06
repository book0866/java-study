package array;

public class Ex7 {

	public static void main(String[] args) {
		
		// 2차원 배열 생성 및 초기화
		int[][] arr = { {2, 4, 6}, {3, 6, 9} };
		
		// 외부와 내부의 변수명은 다르게 만들어야 함
		for (int i = 0; i < 2; i++) { // 외부(행 인덱스)
			
			for (int j = 0; j < 3; j++) { // 외부(열 인덱스)
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
			
		}
		
		for (int i = 0; i < 2; i++) { // 외부(행 인덱스)
			
			for (int j = 0; j < 3; j++) { // 외부(열 인덱스)
				System.out.print("[" +  i + "," + j + "] ");
			}
			
			System.out.println();
			
		}
		
		
	}

}
