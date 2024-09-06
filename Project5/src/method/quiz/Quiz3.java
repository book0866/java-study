package method.quiz;

public class Quiz3 {
	
	// 두 수를 비교하는 함수를 만들고 호출하세요.
	// 둘 중에 더 큰 수를 구하고 반환하세요.
	
	public static int method(int n1, int n2) { // 모든 상황에서 return을 써야 함. return 둘 중 하나라도 없으면 에러
		
		if (n1 > n2) { // n1이 더 큰 값이므로 n1을 반환한다
			return n1; // return 용도: 1. 값을 반환, 2. 함수 종료
		} else { // n2가 더 큰 값이므로 n2를 반환한다
			return n2; 
		}
	}
	
	public static void main(String[] args) {
		
		int sum = method(10, 5);
		System.out.println(sum);
	}

}
