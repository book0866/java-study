package scope;

public class Quiz3 {
	
	// 블록에 따라 변수의 유효범위를 작성하세요.
	
	// 각 변수의 위치에서 가장 가까운 중괄호{} 찾기
	// ex) Person, int와 가장 가까운 건 메인함수 블록
	public static void main(String[] args) {
		
		Person person = new Person(); // 메인함수 끝나기 전까지
		
		int i = 100; // 메인함수 끝나기 전까지
		
		if(i > 1) {
			String str = "안녕하세요."; // if문 블록 안에서만
			System.out.println();
		}
		
		for(int k = 0; k < 10; k++) { // for문 블록 안에서만
			System.out.println(k);
		}
		
	}

}
