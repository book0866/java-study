package method;

public class Ex2 {
	
	// 두 수를 더하는 함수
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	public static void main(String[] args) {
		// 3과 5의 합을 구하고, 4와 2의 합을 구한 다음에
		// 어느 쪽이 더 큰지 비교하기(하아아.................)
		int sum1 = add(3, 5);
		int sum2 = add(4, 2);
		System.out.println(sum1 > sum2);
		
	}

}
