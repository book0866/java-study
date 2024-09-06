package loop.quiz;

public class Quiz9 {

	public static void main(String[] args) {
		
		// 중첩반복문을 사용해서 직사각형을 그려보세요.
		for (int s = 1; s <= 3; s++) { // 세로(행)
			
			for (int ㅣ = 1; ㅣ <= 5; ㅣ++) { // 가로(열)
				
				System.out.print("*"); // println 쓰면 * 하나마다 줄바꿈됨...
				
			}
			
			System.out.println();
			
		}

	}

}


// 반복문 없이 작성
// System.out.print("*****");
// System.out.print("*****");
// System.out.print("*****");

// 반복문을 사용하여 작성
// 	for (int s = 1; s <= 3; s++) {
//	System.out.print("*****");
//	}