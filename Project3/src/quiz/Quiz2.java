package quiz;

public class Quiz2 {

	// 코드를 보고, x y result의 값을 예상해서 주석으로 작성하세요.
	public static void main(String[] args) {
		
		int x = 10; // 11
		
		int y = 20; // 19
		
		int result = (x++) + (--y); // 29: x(10)와 y(19)를 더해서... 2...9....? x는 아직 증감되지 않았으니까........?
		
		System.out.println(result);
		
	}

}
